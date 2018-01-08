/** 메뉴 보드 작업 
 *  메뉴는 지점 별로 같은 메뉴로 들어가며
 *  메뉴 등록 및 관리는 관리자만 할수가 있다.
 *  하지만 관리자가 등록해 놓은 메뉴를 지점직원들이 선택하여 사용할 수는 있다.
 *  지점에 대한 내용이 필요하다
 *  이벤트 UI를 보아 하니 할인관련 항목이 보이는데 메뉴와 연관될 가능성이 아주 높아보이니 
 *  그 부분까지 생각하고 만들도록 하자
 * **/

package digital.domain;

import java.util.Date;
import java.util.List;

public class Menu extends Admin {
  // 메뉴 번호
  private int menuNo;
  // 메뉴 분류 번호
  private String menuType;
  // 메뉴 이름
  private String menuName;
  // 메뉴 가격
  private String menuPrice;
  // 메뉴 관리자/ 등록자
  private String menuManager;
  // 메뉴 내용
  private String menuContent;
  // 메뉴 열량
  private String menuKcal;
  // 메뉴 등록일
  private Date menuDate;
  // 메뉴 수정일
  private Date menuUdate;
  // 메뉴 삭제 여부 확인
  private String deleteCheck;
  // 메뉴 이미지
  private String menuImage;
  // 메뉴 이미지의 파일 정보
  private List<Upload> info;

  @Override
  public String toString() {
    return "Menu [menuNo=" + menuNo + ", menuType=" + menuType + ", menuName=" + menuName + ", menuPrice=" + menuPrice
        + ", menuManager=" + menuManager + ", menuContent=" + menuContent + ", menuKcal=" + menuKcal + ", menuDate="
        + menuDate + ", menuUdate=" + menuUdate + ", deleteCheck=" + deleteCheck + ", menuImage=" + menuImage
        + ", info=" + info + "]";
  }

  public int getMenuNo() {
    return menuNo;
  }

  public void setMenuNo(int menuNo) {
    this.menuNo = menuNo;
  }

  public String getMenuType() {
    return menuType;
  }

  public void setMenuType(String menuType) {
    this.menuType = menuType;
  }

  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public String getMenuPrice() {
    return menuPrice;
  }

  public void setMenuPrice(String menuPrice) {
    this.menuPrice = menuPrice;
  }

  public String getMenuManager() {
    return menuManager;
  }

  public void setMenuManager(String menuManager) {
    this.menuManager = menuManager;
  }

  public String getMenuContent() {
    return menuContent;
  }

  public void setMenuContent(String menuContent) {
    this.menuContent = menuContent;
  }

  public String getMenuKcal() {
    return menuKcal;
  }

  public void setMenuKcal(String menuKcal) {
    this.menuKcal = menuKcal;
  }

  public Date getMenuDate() {
    return menuDate;
  }

  public void setMenuDate(Date menuDate) {
    this.menuDate = menuDate;
  }

  public Date getMenuUdate() {
    return menuUdate;
  }

  public void setMenuUdate(Date menuUdate) {
    this.menuUdate = menuUdate;
  }

  public String getDeleteCheck() {
    return deleteCheck;
  }

  public void setDeleteCheck(String deleteCheck) {
    this.deleteCheck = deleteCheck;
  }

  public String getMenuImage() {
    return menuImage;
  }

  public void setMenuImage(String menuImage) {
    this.menuImage = menuImage;
  }

  public List<Upload> getInfo() {
    return info;
  }

  public void setInfo(List<Upload> info) {
    this.info = info;
  }

}
