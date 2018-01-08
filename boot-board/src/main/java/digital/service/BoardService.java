package digital.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import digital.domain.Board;

public interface BoardService {
  public List<Board> list(Integer start, Integer end);
  public Board detail(int boardNo) throws Exception;
  public void insert(Board board);
  public void update(Board board);
  public void delete(int boardNo);
  public int count();
  public void increaseHit(int boardNo, HttpSession session);
}
