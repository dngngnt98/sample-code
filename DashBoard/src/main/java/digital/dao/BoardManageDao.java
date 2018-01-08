package digital.dao;

import java.util.List;
import java.util.Map;

import digital.domain.BoardManage;

public interface BoardManageDao {
  public List<BoardManage> list(Map<String,Object> baordMap); 
  public BoardManage boardSelectOne(int boardNo);
  public int count();
  public void insert(BoardManage boardManage);
  public void update(BoardManage boardManage);
  public void delete(int boardNo);
}
