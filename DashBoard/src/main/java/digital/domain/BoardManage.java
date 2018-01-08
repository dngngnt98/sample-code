package digital.domain;

import java.util.Date;

public class BoardManage {
	private int boardNo;
	private String boardManager;
	private String boardType;
	private Date boardCreateDay;
	private Date boardUpdateDay;
	private String boardComment;
	private String deleteCheck;

	@Override
	public String toString() {
		return "BoardManage [boardNo=" + boardNo + ", boardManager=" + boardManager + ", boardType=" + boardType
				+ ", boardCreateDay=" + boardCreateDay + ", boardUpdateDay=" + boardUpdateDay + ", boardComment="
				+ boardComment + ", deleteCheck=" + deleteCheck + "]";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardManager() {
		return boardManager;
	}

	public void setBoardManager(String boardManager) {
		this.boardManager = boardManager;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public Date getBoardCreateDay() {
		return boardCreateDay;
	}

	public void setBoardCreateDay(Date boardCreateDay) {
		this.boardCreateDay = boardCreateDay;
	}

	public Date getBoardUpdateDay() {
		return boardUpdateDay;
	}

	public void setBoardUpdateDay(Date boardUpdateDay) {
		this.boardUpdateDay = boardUpdateDay;
	}

	public String getBoardComment() {
		return boardComment;
	}

	public void setBoardComment(String boardComment) {
		this.boardComment = boardComment;
	}

	public String getDeleteCheck() {
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck) {
		this.deleteCheck = deleteCheck;
	}

}
