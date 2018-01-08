package digital.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.ArticleDao;
import digital.domain.Article;
import digital.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao articleDao;

	@Override
	public List<Article> list(int start, int end) {
		HashMap<String, Object> articleMap = new HashMap<>();
		articleMap.put("start", start);
		articleMap.put("end", end);
		return articleDao.list(articleMap);
	}

	@Override
	public void insert(Article article) {
		articleDao.insert(article);
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
	}

	@Override
	public void delete(int articleNo) {
		articleDao.delete(articleNo);
	}

	@Override
	public int count() {
		return articleDao.count();
	}

	@Override
	public void increaseHit(int articleNo, HttpSession session) {
		// 조회를 시작한 시간 변수
		long clickTime = 0;
		// 첫 조회시 세션에는 아무런 조회 시간이 없기때문에 한번 걸러준다.
		if (session.getAttribute("clickTime_" + articleNo) != null) {
			clickTime = (long) session.getAttribute("clickTime_" + articleNo);
		}
		// 현재 시간을 구한다.
		long curTime = System.currentTimeMillis();
		// 열람 시간이 지나면 카운트 업!
		if (curTime - clickTime > 1 * 1000) {
			articleDao.increaseHit(articleNo);
			session.setAttribute("clickTime" + articleNo, curTime);
		}
	}

}
