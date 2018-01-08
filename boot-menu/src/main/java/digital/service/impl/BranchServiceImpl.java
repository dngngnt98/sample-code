package digital.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.BranchDao;
import digital.domain.Branch;
import digital.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

  @Autowired
  BranchDao branchDao;

  public List<Branch> list(int pageNo, int pageSize) throws Exception {
    HashMap<String, Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);

    return branchDao.selectList(valueMap);

  }

  public Branch get(int no) throws Exception {
    return branchDao.selectOne(no);

  }

  public void add(Branch branch) throws Exception {
    branchDao.insert(branch);
    this.insertImage(branch.getNo(), branch.getPhotoList()); // 지점 사진 추가
  }

  /*public void update(Branch branch) throws Exception {

    int count = branchDao.update(branch);
    if (count < 1) {
      throw new Exception(branch.getNo() + "번 지점을 찾을 수 없습니다.");
    }

    // 지점 사진 갱신
    fileDao.delete(branch.getNo()); // 지점의 모든 사진을 지운다.

    List<Upload> uploadList = branch
    for (Upload upload : uploadList) {

      upload.setBranchNo(branch.getNo());

      fileDao.insert(upload);
    } // 지점 사진 추가

  }*/

  private void insertImage(int no, List<String> imageInfo) {
    HashMap<String, Object> branchMap = new HashMap<>();
    String fileName = imageInfo.get(0).toString();
    String newFileName = imageInfo.get(1).toString();
    String filePath = imageInfo.get(2).toString();
    branchMap.put("fileName", fileName);
    branchMap.put("newFileName", newFileName);
    branchMap.put("filePath", filePath);
    branchMap.put("no", no);
    System.out.println(branchMap);
    branchDao.insertPhoto(branchMap);
  }

  public void remove(int no) throws Exception {
    int count = branchDao.delete(no);
    if (count < 1) {
      throw new Exception(no + "번 지점을 찾을 수 없습니다.");
    }
    try {
      count = branchDao.delete(no);
    } catch (Exception e) {
    }
  }
}
