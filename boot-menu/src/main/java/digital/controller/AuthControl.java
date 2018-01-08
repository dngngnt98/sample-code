package digital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import digital.domain.BranchMaster;
import digital.service.BranchMasterService;

@Controller
@RequestMapping("/auth")
public class AuthControl {
  @Autowired
  BranchMasterService branchMasterService;

  @RequestMapping("form")
  public String form() {
    return "auth/form";
  }

  @RequestMapping("login")
  public String login(HttpServletRequest req, HttpServletResponse res) throws Exception {
    
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    BranchMaster branchmaster = null;
    branchmaster = branchMasterService.getByEmailPassword(email, password);
    System.out.println(branchmaster);
    if (branchmaster != null) {
      HttpSession session = req.getSession();
      session.setAttribute("loginuser", branchmaster);
      return "auth/index";
    } 
    else {
      return "auth/form";
    }
  }

  @RequestMapping("logout")
  public String logout(HttpServletRequest req, HttpServletResponse res) throws Exception {
    req.getSession().invalidate();
    return "redirect:../auth/form";
  }
  
  @RequestMapping("registadmin")
  public String add(Admin admin) throws Exception {
    adminService.insert(admin);
    return "../auth/form";
  }

}