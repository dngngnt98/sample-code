package digital.dao;

import java.util.HashMap;
import java.util.List;

import digital.domain.Menu;

public interface MenuDao {
  public List<Menu> list(HashMap<String, Object> menuMap);

  public void insert(Menu menu);

  public void update(Menu menu);

  public void delete(int menuNo);

  public void insertImg(HashMap<String, Object> imageMap);

  public List<String> imgList(int menuNo);

  public void deleteImg(int menuNo);

  public int count();
}
