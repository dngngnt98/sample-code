package digital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import digital.domain.Branch;
import digital.service.BranchService;
import digital.service.UploadService;
import digital.utils.FileSystem;

@Controller
@RequestMapping("/branch")
public class BranchControl {

	@Autowired
	BranchService branchService;
	@Autowired
	UploadService uploadService;

	@RequestMapping("list")
	public String list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "20") int pageSize,
			Model model) throws Exception {

		List<Branch> list = branchService.list(pageNo, pageSize);
		model.addAttribute("list", list);

		return "branch/list";
	}

	@RequestMapping("add")
	public String add(Branch branch, MultipartFile[] photo) throws Exception {
	  FileSystem fileSystem = new FileSystem();
    List<String> imageInfo = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      if (fileItem != null) {
        String fileName = fileItem.getOriginalFilename();
        String newFileName = fileSystem.newFileName();
        String filePath = uploadService.fileUpload(fileItem, newFileName);
        imageInfo.add(fileName);
        imageInfo.add(newFileName);
        imageInfo.add(filePath);
      }
    }
		branch.setPhotoList(imageInfo);
		branchService.add(branch);

		return "redirect:list";
	}

	/*@RequestMapping("update")
	public String update(Branch branch, MultipartFile[] photo) throws Exception {
	  FileSystem fileSystem = new FileSystem();
    List<String> imageInfo = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      if (fileItem != null) {
        String fileName = fileItem.getOriginalFilename();
        String newFileName = fileSystem.newFileName();
        String filePath = uploadService.fileUpload(fileItem, newFileName);
        imageInfo.add(fileName);
        imageInfo.add(newFileName);
        imageInfo.add(filePath);
      }
    }
		branch.setPhotoList(imageInfo);
		branchService.update(branch);
		return "redirect:list";
	}*/

	@RequestMapping("detail")
	public String detail(int no, Model model) throws Exception {
		Branch branch = branchService.get(no);
		if (branch == null) {
			throw new Exception(no + "번 회원이 없습니다.");
		}
		model.addAttribute("branch", branch);
		return "branch/detail";

	}

	@RequestMapping("delete")
	public String delete(int no) throws Exception {
		branchService.remove(no);
		return "redirect:list";
	}

}
