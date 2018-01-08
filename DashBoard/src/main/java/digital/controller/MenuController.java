package digital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import digital.domain.Menu;
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

	@RequestMapping("form")
	public String main() {
		return "menu/manageform";
	}

	@RequestMapping("insertform")
	public String insertForm() {
		return "menu/menuregistform";
	}

	@RequestMapping("list")
	// 현재 페이지를 1로 초기화, 객체 정보를 담을 모델 객체
	public String list(@RequestParam(defaultValue = "1") int curPage, Model model) throws Exception {
		int count = 0;
		// 게시물 수 계산
		count = menuService.count();
		// 페이지 처리관련 객체 생성 (생성자 활용)
		Paging paging = new Paging(curPage, count);
		// 게시물의 시작과 끝
		int start = paging.getStart();
		int end = paging.getEnd();
		List<Menu> menuList = menuService.list(start, end);
		System.out.println(menuList);
		model.addAttribute("menuList", menuList);
		model.addAttribute("count", count);
		model.addAttribute("paging", paging);
		return "menu/manageform";
	}

	@RequestMapping("insert")
	public String insert(Menu menu, MultipartFile[] photo) throws Exception {

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
		System.out.println(imageInfo);
		menu.setImageInfo(imageInfo);
		menuService.insert(menu);
		return "redirect:../menu/list";
	}

	/*
	 * public String update(Menu menu, Model model) {
	 * 
	 * menuService.update(menu); return ""; }
	 * 
	 * public String delete(int menuNo) { menuService.delete(menuNo); return ""; }
	 */

}
