package digital.domain;

import java.util.Date;

public class Upload extends Menu {
	private int uploadNo;
	// 원본 파일명
	private String fileName;
	// 새로운 파일명
	private String newFileName;
	// 파일 패스
	private String filePath;
	// 업로드 날짜
	private Date uploadDate;
	// 수정 날짜
	private Date updateDate;
	// 파일 삭제 여부
	private String delCheck;
	// 파일 작성자
	private String uploder;

	@Override
	public String toString() {
		return "Upload [uploadNo=" + uploadNo + ", fileName=" + fileName + ", newFileName=" + newFileName
				+ ", filePath=" + filePath + ", uploadDate=" + uploadDate + ", updateDate=" + updateDate + ", delCheck="
				+ delCheck + ", uploder=" + uploder + "]";
	}

	public int getUploadNo() {
		return uploadNo;
	}

	public void setUploadNo(int uploadNo) {
		this.uploadNo = uploadNo;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelCheck() {
		return delCheck;
	}

	public void setDelCheck(String delCheck) {
		this.delCheck = delCheck;
	}

	public String getUploder() {
		return uploder;
	}

	public void setUploder(String uploder) {
		this.uploder = uploder;
	}

	@Override
	public int getMenuNo() {
		// TODO Auto-generated method stub
		return super.getMenuNo();
	}

	@Override
	public void setMenuNo(int menuNo) {
		// TODO Auto-generated method stub
		super.setMenuNo(menuNo);
	}

}
