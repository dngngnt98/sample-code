package digital.domain;

import java.util.Date;
import java.util.List;

public class Template {
  private int templateNo;
  private String templateType;
  private String templateName;
  private String templateComment;
  private Date templateDate;
  private Date templateUplDate;
  private String deleteCheck;
  private List<String> uploadList;

  @Override
  public String toString() {
    return "Template [templateNo=" + templateNo + ", templateType=" + templateType + ", templateName=" + templateName
        + ", templateComment=" + templateComment + ", templateDate=" + templateDate + ", templateUplDate="
        + templateUplDate + ", deleteCheck=" + deleteCheck + ", uploadList=" + uploadList + "]";
  }

  public int getTemplateNo() {
    return templateNo;
  }

  public void setTemplateNo(int templateNo) {
    this.templateNo = templateNo;
  }

  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }

  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public String getTemplateComment() {
    return templateComment;
  }

  public void setTemplateComment(String templateComment) {
    this.templateComment = templateComment;
  }

  public Date getTemplateDate() {
    return templateDate;
  }

  public void setTemplateDate(Date templateDate) {
    this.templateDate = templateDate;
  }

  public Date getTemplateUplDate() {
    return templateUplDate;
  }

  public void setTemplateUplDate(Date templateUplDate) {
    this.templateUplDate = templateUplDate;
  }

  public String getDeleteCheck() {
    return deleteCheck;
  }

  public void setDeleteCheck(String deleteCheck) {
    this.deleteCheck = deleteCheck;
  }

  public List<String> getUploadList() {
    return uploadList;
  }

  public void setUploadList(List<String> uploadList) {
    this.uploadList = uploadList;
  }

}
