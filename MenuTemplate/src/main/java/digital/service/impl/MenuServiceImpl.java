package digital.service.impl;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.MenuDao;
import digital.dao.UploadDao;
import digital.domain.Menu;
import digital.domain.Upload;
import digital.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
  private static final Logger logger = (Logger) LoggerFactory.getLogger(MenuServiceImpl.class);

	@Autowired
	MenuDao menuDao;
	
	@Autowired
	UploadDao uploadDao;
	
	@Override
	public List<Menu> list(int start, int end) {
		HashMap<String, Object> menuMap = new HashMap<>();
		menuMap.put("start", start);
		menuMap.put("end", end);
		return menuDao.list(menuMap);
	}

	@Override
	public void insert(Menu menu) {
		if (menu == null) {
			System.out.println("not exists menu data!");
			return;
		}
		menuDao.insert(menu);
		
		List<Upload> uploadList =menu.getInfo();
		for (Upload upload:uploadList) {
			upload.setMenuNo(menu.getMenuNo());
			uploadDao.insert(upload);
		}
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
	public int count(Menu menu) {
		return menuDao.count(menu);
	}

}
