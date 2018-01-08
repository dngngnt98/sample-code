package digital.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import digital.domain.Admin;
import digital.service.AdminService;

@Controller
@RequestMapping("/auth")
public class AuthControl {
  @Autowired
  AdminService adminService;

  @RequestMapping("form")
  public String form() {
    return "auth/form";
  }

  @RequestMapping("login")
  public String login(HttpServletRequest req, HttpServletResponse res, HttpSession session) throws Exception {
    
    String adminMail = req.getParameter("email");
    String adminPassword = req.getParameter("password");
    System.out.println(adminMail);
    Admin admin = null;
    admin = adminService.getByEmailPassword(adminMail, adminPassword);
    System.out.println(admin);
    if (admin != null) {
      session.setAttribute("loginadmin", admin);
      return "redirect:../menu/manageform";
    } 
    else {
      return "/index.html";
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