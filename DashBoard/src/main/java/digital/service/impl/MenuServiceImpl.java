package digital.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.MenuDao;
import digital.domain.Menu;
import digital.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

  @Autowired
  MenuDao menuDao;

  @Override
  public List<Menu> list(int start, int end) throws Exception {
    HashMap<String, Object> menuMap = new HashMap<>();
    menuMap.put("start", start);
    menuMap.put("end", end);
    System.out.println(menuMap);
    return menuDao.list(menuMap);
  }

  @Override
  public void insert(Menu menu) throws Exception {
    menuDao.insert(menu);
    System.out.println(menu);
    this.insertImage(menu.getMenuNo(), menu.getImageInfo());
  }

  private void insertImage(int menuNo, List<String> imageInfo) {
    HashMap<String, Object> imageMap = new HashMap<>();
    String fileName = imageInfo.get(0).toString();
    String newFileName = imageInfo.get(1).toString();
    String filePath = imageInfo.get(2).toString();
    imageMap.put("fileName", fileName);
    imageMap.put("newFileName", newFileName);
    imageMap.put("filePath", filePath);
    imageMap.put("menuNo", menuNo);
    System.out.println(imageMap);
    menuDao.insertImg(imageMap);
  }

  @Override
  public void update(Menu menu) {
    menuDao.update(menu);
  }

  @Override
  public void delete(int menuNo) {
    menuDao.delete(menuNo);
  }

  @Override
  public int count() throws Exception {
    return menuDao.count();
  }

}
