package digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import digital.domain.Article;
import digital.service.ArticleService;
import digital.utils.Paging;

@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("normal")
	public String typeNormal() {
		return "board/listform";
	}
	
	@RequestMapping("insertform")
	public String insertForm() {
		return "board/writeform";
	}
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int curPage, Model model) {
		
		int count = 0;
		// 게시물 수 계산
		count = articleService.count();
		// 페이지 처리관련 객체 생성 (생성자 활용)
		Paging paging = new Paging(curPage, count);
		// 게시물의 시작과 끝
		int start = paging.getStart();
		int end = paging.getEnd();
		List<Article> article = articleService.list(start, end);

		model.addAttribute("article", article);
		model.addAttribute("count", count);
		model.addAttribute("paging", paging);
		
		return "board/listform";
	}
	
	@RequestMapping("insert")
	public String insertForm(Article article) throws Exception {
		
		articleService.insert(article);
		return "redirect:../board/listform";
	}
	
	@RequestMapping("update")
	public String insertForm(Article article, Model model) throws Exception {
		
		articleService.update(article);
		return "redirect:../board/detail";
	}
}
