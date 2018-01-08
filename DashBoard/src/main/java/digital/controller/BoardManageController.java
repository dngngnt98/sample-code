package digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import digital.domain.BoardManage;
import digital.service.BoardManageService;
import digital.utils.Paging;

@Controller
@RequestMapping("/board")
public class BoardManageController {

	@Autowired
	BoardManageService boardManageService;
	
	@RequestMapping("registform")
	public String registForm() {
		return "board/registform";
	}
	
	@RequestMapping("list")
	// 현재 페이지를 1로 초기화, 객체 정보를 담을 모델 객체
	public String list(@RequestParam(defaultValue = "1") int curPage, Model model) throws Exception {
		int count = 0;
		// 게시물 수 계산
		count = boardManageService.count();
		// 페이지 처리관련 객체 생성 (생성자 활용)
		Paging paging = new Paging(curPage, count);
		// 게시물의 시작과 끝
		int start = paging.getStart();
		int end = paging.getEnd();
		List<BoardManage> boardList = boardManageService.list(start, end);

		model.addAttribute("boardList", boardList);
		model.addAttribute("count", count);
		model.addAttribute("paging", paging);
		return "board/manageform";
	}

	@RequestMapping("detail")
	public String detail(int boardNo, Model model) throws Exception {
		BoardManage boardManage = boardManageService.detail(boardNo);
		model.addAttribute("detail", boardManage);
		return "board/detail";
	}

	@RequestMapping("modifyform")
	public String modifyForm(int boardNo, Model model) throws Exception {
		model.addAttribute("detail", boardManageService.detail(boardNo));
		return "board/modifyform";
	}

	@RequestMapping("insert")
	public String insertForm(BoardManage boardManage) throws Exception {
		boardManageService.insert(boardManage);
		return "redirect:../board/list";
	}

	@RequestMapping("delete")
	public String delete(int boardNo) throws Exception {
		boardManageService.delete(boardNo);
		return "redirect:../board/list";
	}
}
