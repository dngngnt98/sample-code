package digital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import digital.domain.Template;
import digital.domain.Upload;
import digital.service.TemplateService;
import digital.service.UploadService;
import digital.utils.FileSystem;

@Controller
@RequestMapping("template")
public class TemplateController {

  @Autowired
  TemplateService templateService;
  
  @Autowired
  UploadService uploadService;

  @RequestMapping("menuform")
  public String menuForm() {
    return "";
  }
  
  @RequestMapping("infoPage")
  public String registForm() {
    return "template/registform";
  }
  
  @RequestMapping("updatePage")
  public String updateForm() {
    return "template/modifyform";
  }

  @RequestMapping("list")
  public String list(@RequestParam(defaultValue = "1") int start, @RequestParam(defaultValue = "5") int end,
      Model model) {

    List<Template> templateList = templateService.list(start, end);
    System.out.println(templateList);
    model.addAttribute("templateList", templateList);

    return "template/manageform";
  }

  @RequestMapping("insert")
  public String insert(Template template, MultipartFile[] file) throws Exception {
    FileSystem fileSystem = new FileSystem();

    ArrayList<String> uploadList = new ArrayList<>();
    for (MultipartFile fileItem : file) {
      if (fileItem != null) {
        String fileName = fileItem.getOriginalFilename();
        String newFileName = fileSystem.newFileName();
        String filePath = uploadService.fileUpload(fileItem, newFileName); 
        uploadList.add(fileName);
        uploadList.add(newFileName);
        uploadList.add(filePath);
      }
    }
    template.setUploadList(uploadList);
    templateService.insert(template);
    return "redirect:../template/list";
  }

  @RequestMapping("update")
  public String update(Template template, Model model) {

    templateService.update(template);

    model.addAttribute("template", template);

    return "redirect:../template/list";
  }

  @RequestMapping("delete")
  public String delete(int templateNo) {
    templateService.delete(templateNo);
    return "redirect:../template/list";
  }

}
