package digital.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import digital.domain.Board;
import digital.service.BoardService;
import digital.service.UploadService;
import digital.utils.FileSystem;
import digital.utils.Paging;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;

	@Autowired
	UploadService uploadService;
	
	@RequestMapping("menuform")
	public String menuForm() {
		return "";
	}

	@RequestMapping("insertform")
	public String registForm() {
		return "board/writeform";
	}

	@RequestMapping("updatePage")
	public String updateForm() {
		return "board/modifyform";
	}

	@RequestMapping("list")
	public String list(@RequestParam(defaultValue = "1") int curPage, Model model) {

		Integer count = 0;
		Integer start = 0;
		Integer end = 0;
		// 게시물 수 계산
		count = boardService.count();
		System.out.println(count);
		// 페이지 처리관련 객체 생성 (생성자 활용)
		Paging paging = new Paging(curPage, count);
		// 게시물의 시작과 끝
		start = paging.getStart();
		end = paging.getEnd();
		System.out.println(start+"-----------"+end);
		List<Board> boardList = boardService.list(start, end);
		System.out.println(boardList);
		model.addAttribute("boardList", boardList);
		model.addAttribute("paging", paging);

		return "board/listform";
	}

	@RequestMapping("insert")
	public String insert(Board board, MultipartFile[] file) throws Exception {
		FileSystem fileSystem = new FileSystem();
		System.out.println(file);
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
		board.setUploadList(uploadList);
		boardService.insert(board);
		return "redirect:../board/list";
	}

	@RequestMapping("update")
	public String update(Board board, Model model) {

		boardService.update(board);

		model.addAttribute("template", board);

		return "redirect:../board/list";
	}

	@RequestMapping("delete")
	public String delete(int templateNo) {
		boardService.delete(templateNo);
		return "redirect:../board/list";
	}
	
	

}
