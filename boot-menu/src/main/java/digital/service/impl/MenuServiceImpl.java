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

  public List<Menu> list(int start, int end) throws Exception {
    HashMap<String, Object> menuMap = new HashMap<>();
    menuMap.put("start", (start - 1) * end);
    menuMap.put("end", end);

    return menuDao.list(menuMap);
  }

  /*
   * public Menu get(int menuNo) throws Exception { return
   * menuDao.selectOne(menuNo); }
   */

  /*
   * public Menu getByEmailPassword(String email, String password) throws
   * Exception { HashMap<String, Object> menuMap = new HashMap<>();
   * menuMap.put("email", email); menuMap.put("password", password);
   * 
   * return menuDao.selectOneByEmailPassword(menuMap); }
   */
  @Override
  public void insert(Menu menu) throws Exception {
    menuDao.insert(menu);
    this.insertImage(menu.getMenuNo(), menu.getImageInfo()); 
  }

  public void update(Menu menu) {
    menuDao.update(menu);
//    menuDao.deletePhoto(menu.getMenuNo());
    this.insertImage(menu.getMenuNo(), menu.getImageInfo());
  }

  private void insertImage(int menuNo, List<String> imageInfo) {
    HashMap<String, Object> menuMap = new HashMap<>();
    String fileName = imageInfo.get(0).toString();
    String newFileName = imageInfo.get(1).toString();
    String filePath = imageInfo.get(2).toString();
    menuMap.put("fileName", fileName);
    menuMap.put("newFileName", newFileName);
    menuMap.put("filePath", filePath);
    menuMap.put("menuNo", menuNo);
    System.out.println(menuMap);
    menuDao.insertImg(menuMap);
  }

  /*public void delete(int menuNo) throws Exception {
    menuDao.deletePhoto(menuNo);
    menuDao.delete(menuNo);
  }*/
  
  @Override
  public int count() throws Exception {
    return menuDao.count();
  }

  @Override
  public void delete(int menuNo) {
  }
}
