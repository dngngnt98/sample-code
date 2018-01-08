package digital.domain;

import java.util.Date;

public class Reply {
	private Integer replyNo;
	private Integer boardNo;
	private String replyContent;
	private String replyer;
	private Date replyDate;
	private Date replyUpDate;

	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", boardNo=" + boardNo + ", replyContent=" + replyContent + ", replyer="
				+ replyer + ", replyDate=" + replyDate + ", replyUpDate=" + replyUpDate + "]";
	}

	public Integer getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(Integer replyNo) {
		this.replyNo = replyNo;
	}

	public Integer getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyer() {
		return replyer;
	}

	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	public Date getReplyUpDate() {
		return replyUpDate;
	}

	public void setReplyUpDate(Date replyUpDate) {
		this.replyUpDate = replyUpDate;
	}

}
