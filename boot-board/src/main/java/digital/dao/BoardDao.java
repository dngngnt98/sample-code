package digital.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import digital.domain.Board;

public interface BoardDao {
  public List<Board> list(HashMap<String, Object> tempMap);
  public Board boardSelectOne(int boardNo);
  public void insert(Board board);
  public void update(Board board);
  public void delete(int templateNo);
  public void insertFile(Map<String, Object> imageMap);
  public Integer count();
  public void increaseHit(int articleNo);
}
