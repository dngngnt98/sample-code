package digital.service;

import java.util.List;

import digital.domain.Menu;

public interface MenuService {
	public List<Menu> list(int start, int end) throws Exception;
	public void insert(Menu menu) throws Exception;
//	public void update(Menu menu);
	public void delete(int menuNo);
	public int count() throws Exception;
}
