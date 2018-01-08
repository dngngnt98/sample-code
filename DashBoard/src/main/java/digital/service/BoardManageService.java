package digital.service;

import java.util.List;

import digital.domain.BoardManage;


public interface BoardManageService {
	List<BoardManage> list(int start, int end) throws Exception;
	BoardManage detail(int boardNo) throws Exception;
	void insert(BoardManage board) throws Exception;
	void update(BoardManage board) throws Exception;
	void delete(int boardNo) throws Exception;
	int count() throws Exception;
}
