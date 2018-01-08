package digital.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MenuChangeController {
  
  @RequestMapping("request")
  public String requestView(Model model) {
    
    model.addAttribute("", );
    
    return "requestMenu";
  }
 /* // 뿌려주는 정보는 메뉴랑 
  public String requestView(Model model) {
    Branch branch = branchService.selectOne(int branchNo);
    model.addAttribute("branch", branch); 
    return "";
  }
  
  public String insert(MenuRequest menuRequest, HttpSession session) {
    String branchName = session.getAttribute("branchName");
    menuRequest.setRequester(branchName);
    menuRequestService.insert(menuRequest);
    return "";
  }*/
}
