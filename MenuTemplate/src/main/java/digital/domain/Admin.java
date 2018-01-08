package digital.domain;

public class Admin {
  int adminNo;
  int boardNo;
  String adminMail;
  String adminPassword;
  String adminName;
  String adminDate;
  String adminGrade;

  @Override
  public String toString() {
    return "Admin [adminNo=" + adminNo + ", boardNo=" + boardNo + ", adminMail=" + adminMail + ", adminPassword="
        + adminPassword + ", adminName=" + adminName + ", adminDate=" + adminDate + ", adminGrade=" + adminGrade + "]";
  }

  public int getAdminNo() {
    return adminNo;
  }

  public void setAdminNo(int adminNo) {
    this.adminNo = adminNo;
  }

  public int getBoardNo() {
    return boardNo;
  }

  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }

  public String getAdminMail() {
    return adminMail;
  }

  public void setAdminMail(String adminMail) {
    this.adminMail = adminMail;
  }

  public String getAdminPassword() {
    return adminPassword;
  }

  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }

  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public String getAdminDate() {
    return adminDate;
  }

  public void setAdminDate(String adminDate) {
    this.adminDate = adminDate;
  }

  public String getAdminGrade() {
    return adminGrade;
  }

  public void setAdminGrade(String adminGrade) {
    this.adminGrade = adminGrade;
  }

}