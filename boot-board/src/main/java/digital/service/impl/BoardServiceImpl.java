package digital.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.BoardDao;
import digital.domain.Board;
import digital.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;

	@Override
	public List<Board> list(Integer start, Integer end) {
		HashMap<String, Object> tempMap = new HashMap<>();
		tempMap.put("start", start);
		tempMap.put("end", end);
		System.out.println(tempMap);
		return boardDao.list(tempMap);
	}

	@Override
	public void insert(Board board) {
		boardDao.insert(board);
		this.insertFile(board.getBoardNo(), board.getUploadList());
	}

	private void insertFile(int boardNo, List<String> uploadInfo) {
		Map<String, Object> fileMap = new HashMap<>();
		String fileName = uploadInfo.get(0).toString();
		String newFileName = uploadInfo.get(1).toString();
		String filePath = uploadInfo.get(2).toString();
		fileMap.put("fileName", fileName);
		fileMap.put("newFileName", newFileName);
		fileMap.put("filePath", filePath);
		fileMap.put("boardNo", boardNo);
		System.out.println(fileMap);
		boardDao.insertFile(fileMap);
	}

	@Override
	public void update(Board board) {
		boardDao.update(board);
	}

	@Override
	public void delete(int templateNo) {
		boardDao.delete(templateNo);
	}

	@Override
	public Board detail(int boardNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return boardDao.count();
	}

	@Override
	public void increaseHit(int boardNo, HttpSession session) {
		// TODO Auto-generated method stub
		long clickTime = 0;
		// 첫 조회시 세션에는 아무런 조회 시간이 없기때문에 한번 걸러준다.
		if (session.getAttribute("clickTime_" + boardNo) != null) {
			clickTime = (long) session.getAttribute("clickTime_" + boardNo);
		}
		// 현재 시간을 구한다.
		long curTime = System.currentTimeMillis();
		// 열람 시간이 지나면 카운트 업!
		if (curTime - clickTime > 1 * 1000) {
			boardDao.increaseHit(boardNo);
			session.setAttribute("clickTime" + boardNo, curTime);
		}
	}

}
