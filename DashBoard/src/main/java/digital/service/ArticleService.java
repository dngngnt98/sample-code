package digital.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import digital.domain.Article;

public interface ArticleService {
	public List<Article> list(int start, int end);
	public void insert(Article article);
	public void update(Article article);
	public void delete(int articleNo);
	public int count();
	public void increaseHit(int articleNo, HttpSession session);
}
