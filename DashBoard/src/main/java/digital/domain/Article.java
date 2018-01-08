package digital.domain;

public class Article extends BoardManage {
	int articleNo;
	int boardNo;
	String articleWriter;
	String articleSubject;
	String articleContent;
	String articleCreateDay;
	String articleUpdateDay;
	String articleHit;
	String deleteCheck;
//	String List<Upload> fileInfo;

	@Override
	public String toString() {
		return "Article [articleNo=" + articleNo + ", boardNo=" + boardNo + ", articleWriter=" + articleWriter
				+ ", articleSubject=" + articleSubject + ", articleContent=" + articleContent + ", articleCreateDay="
				+ articleCreateDay + ", articleUpdateDay=" + articleUpdateDay + ", articleHit=" + articleHit
				+ ", deleteCheck=" + deleteCheck + "]";
	}

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getArticleWriter() {
		return articleWriter;
	}

	public void setArticleWriter(String articleWriter) {
		this.articleWriter = articleWriter;
	}

	public String getArticleSubject() {
		return articleSubject;
	}

	public void setArticleSubject(String articleSubject) {
		this.articleSubject = articleSubject;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleCreateDay() {
		return articleCreateDay;
	}

	public void setArticleCreateDay(String articleCreateDay) {
		this.articleCreateDay = articleCreateDay;
	}

	public String getArticleUpdateDay() {
		return articleUpdateDay;
	}

	public void setArticleUpdateDay(String articleUpdateDay) {
		this.articleUpdateDay = articleUpdateDay;
	}

	public String getArticleHit() {
		return articleHit;
	}

	public void setArticleHit(String articleHit) {
		this.articleHit = articleHit;
	}

	public String getDeleteCheck() {
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck) {
		this.deleteCheck = deleteCheck;
	}

}