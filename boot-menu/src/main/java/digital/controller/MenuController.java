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

	@RequestMapping("insert")
  public String insert(
      Menu menu, 
      MultipartFile[] file) throws Exception {
	  FileSystem fileSystem = new FileSystem();
    List<String> imageInfo = new ArrayList<>();
    for (MultipartFile fileItem : file) {
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
    System.out.println(menu);
    return "redirect:../menu/list";
  }
  
  @RequestMapping("delete")
  public String delete(int menuNo) throws Exception {
    menuService.delete(menuNo);
    return "redirect:list.do";
  }  

  /*@RequestMapping("detail")
  public String detail(int mneuNo, Model model) throws Exception {
    Menu menu = menuService.get(mneuNo);
    if (menu == null) {
      throw new Exception(no + "번 강사가 없습니다.");
    }
    model.addAttribute("menu", menu);
    return "menu/detail";
  }*/

  @RequestMapping("list")
  public String list(@RequestParam(defaultValue = "1") int curPage, Model model) throws Exception {
    int count = menuService.count();
    Paging paging = new Paging(curPage, count);
    int start =  paging.getStart();
    int end = paging.getEnd();
    List<Menu> menuList = menuService.list(start, end);
    System.out.println(menuList);
    model.addAttribute("menuList", menuList);
    model.addAttribute("count", count);
    model.addAttribute("paging", paging);
    return "menu/manageform";
  }
  
  @RequestMapping("update")
  public String update(
      Menu menu, 
      MultipartFile[] file) throws Exception {
    FileSystem fileSystem = new FileSystem();
    List<String> imageInfo = new ArrayList<>();
    for (MultipartFile fileItem : file) {
      if (fileItem != null) {
        String fileName = fileItem.getOriginalFilename();
        String newFileName = fileSystem.newFileName();
        String filePath = uploadService.fileUpload(fileItem, newFileName);
        imageInfo.add(fileName);
        imageInfo.add(newFileName);
        imageInfo.add(filePath);
      }
    }
    menu.setImageInfo(imageInfo);
//    menuService.update(menu);
    return "redirect:list";
  }

}
