package digital.dao;

import java.util.List;
import java.util.Map;

import digital.domain.Article;

public interface ArticleDao {
	// 게시글 목록
	public List<Article> list(Map<String, Object> articleMap);
	// 게시글 작성
	public void insert(Article article);
	// 게시글 수정
	public void update(Article article);
	// 게시글 삭제
	public void delete(int articleNo);
	// 게시글 수
	public int count();
	// 조회수 증가
	public void increaseHit(int articleNo);
}
