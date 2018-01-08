package digital.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import digital.domain.Reply;
import digital.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService replyService;
	
	public void insert(Reply reply, HttpSession session) {
		String userMail = (String) session.getAttribute("email");
		reply.setReplyer(userMail);
		replyService.insert(reply);
	}
	
	public String list(int boardNo, Model model) {
		List<Reply> list = replyService.list(boardNo);
		model.addAttribute("list", list);
		return "";
	}
}
