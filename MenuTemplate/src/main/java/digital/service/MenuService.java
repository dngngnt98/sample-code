package digital.service;

import java.util.List;

import digital.domain.Menu;

public interface MenuService {
	
	// 메뉴 목록
	public List<Menu> list(int start, int end);

	// 메뉴 정보 추가
	public void insert(Menu menu);

	// 메뉴 정보 수정
	public void update(Menu menu);

	// 메뉴 삭제
	public void delete(int menuNo);

	// 메뉴 카운트
	public int count(Menu menu);
}
