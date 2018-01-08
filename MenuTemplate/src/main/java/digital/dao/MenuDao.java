package digital.dao;

import java.util.List;
import java.util.Map;

import digital.domain.Menu;

public interface MenuDao {
  // 메뉴 목록
  public List<Menu> list(Map<String, Object> menuMap);

  // 메뉴 추가
  public void insert(Menu menu);

  // 메뉴 수정
  public void update(Menu menu); // 메뉴 삭제

  // 메뉴 삭제
  public void delete(int menuNo);

  // 페이징 처리를 위한 카운트
  public int count(Menu menu);
}
