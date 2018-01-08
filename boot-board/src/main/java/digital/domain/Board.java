package digital.domain;

import java.util.Date;
import java.util.List;

public class Board {
	private Integer boardNo;
	private String boardType;
	private String boardSubject;
	private String boardContent;
	private Date boardCreateDay;
	private Date boardUpdateDay;
	private Integer boardHit;
	private String deleteCheck;
	private List<String> uploadList;

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardType=" + boardType + ", boardSubject=" + boardSubject
				+ ", boardContent=" + boardContent + ", boardCreateDay=" + boardCreateDay + ", boardUpdateDay="
				+ boardUpdateDay + ", deleteCheck=" + deleteCheck + ", boardHit=" + boardHit + ", uploadList="
				+ uploadList + "]";
	}

	public Integer getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getBoardSubject() {
		return boardSubject;
	}

	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
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

	public String getDeleteCheck() {
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck) {
		this.deleteCheck = deleteCheck;
	}

	public Integer getBoardHit() {
		return boardHit;
	}

	public void setBoardHit(Integer boardHit) {
		this.boardHit = boardHit;
	}

	public List<String> getUploadList() {
		return uploadList;
	}

	public void setUploadList(List<String> uploadList) {
		this.uploadList = uploadList;
	}

}
