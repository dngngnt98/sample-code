package digital.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.BoardManageDao;
import digital.domain.BoardManage;
import digital.service.BoardManageService;

@Service
public class BoardManageServiceImpl implements BoardManageService {
	@Autowired
	BoardManageDao boardManageDao;

	@Override
	public List<BoardManage> list(int start, int end) throws Exception {
		HashMap<String, Object> boardMap = new HashMap<>();
		boardMap.put("start", start);
		boardMap.put("end", end);
		return boardManageDao.list(boardMap);
	}

	@Override
	public int count() throws Exception {
		return boardManageDao.count();
	}

	@Override
	public BoardManage detail(int boardNo) throws Exception {
		// TODO Auto-generated method stub
		return boardManageDao.boardSelectOne(boardNo);
	}
	
	@Override
	public void insert(BoardManage board) throws Exception {
		boardManageDao.insert(board);
	}

	@Override
	public void update(BoardManage board) throws Exception {
		boardManageDao.update(board);
	}

	@Override
	public void delete(int boardNo) throws Exception {
		boardManageDao.delete(boardNo);
	}

}