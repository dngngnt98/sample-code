package digital.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import digital.domain.Menu;
import digital.domain.Upload;
import digital.service.MenuService;
import digital.service.UploadService;
import digital.utils.FileSystem;
import digital.utils.Paging;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService menuService;

	@Autowired
	UploadService uploadService;

	@RequestMapping("registform")
	public String addform() {
		System.out.println();
		return "menu/menuregistform";
	}

	@RequestMapping("manageform")
	public String menuList(Model model, @RequestParam(defaultValue = "1") int curPage) {
		Menu menu = new Menu();
		// 게시물 수 계산
		int count = menuService.count(menu);
		// 페이지 처리관련 객체 생성 (생성자 활용)
		Paging paging = new Paging(curPage, count);
		// 게시물의 시작과 끝
		int start = paging.getStart();
		int end = paging.getEnd();
		
		List<Menu> menuList = menuService.list(start, end);
		
		model.addAttribute("menuList", menuList);
		model.addAttribute("count", count);
		model.addAttribute("paging", paging);
		
		return "menu/manageform";
	}

	// 메뉴 정보 추가()
	@RequestMapping("insert")
	public String addmenu(MultipartFile[] file, Menu menu) throws Exception {
		FileSystem fileSystem = new FileSystem();
		Upload upload = new Upload();
		ArrayList<Upload> info = new ArrayList<>();
		for (MultipartFile fileItem : file) {
			if (fileItem != null) {
			      String fileName = fileItem.getOriginalFilename();
			      String newFileName = fileSystem.newFileName();
			      upload.setFileName(fileName);
			      upload.setNewFileName(newFileName);
			      uploadService.fileUpload(fileItem, newFileName);
			      info.add(upload);
			    }
		}
		menu.setInfo(info);
		menuService.insert(menu);
		return "redirect:../menu/manageform";
	}

	public String updateMenu(Menu menu, MultipartFile[] file, Model model)
			throws Exception {
		FileSystem fileSystem = new FileSystem();
		Upload upload = new Upload();
		ArrayList<Upload> uploadList = new ArrayList<>();
		for (MultipartFile fileItem : file) {
			if (fileItem != null) {
			      String fileName = fileItem.getOriginalFilename();
			      String newFileName = fileSystem.newFileName();
			      upload.setFileName(fileName);
			      upload.setNewFileName(newFileName);
			      uploadService.fileUpload(fileItem, newFileName);
			      uploadList.add(upload);
			    }
		}
		menu.setInfo(uploadList);
		menuService.update(menu);
		return "redirect:../menu/manageform";
	}

}
