package digital.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.TemplateDao;
import digital.dao.UploadDao;
import digital.domain.Template;
import digital.service.TemplateService;

@Service
public class TemplateServiceImpl implements TemplateService {

  @Autowired
  TemplateDao templateDao;
  
  @Autowired
  UploadDao uploadDao;

  @Override
  public List<Template> list(int start, int end) {
    HashMap<String, Object> tempMap = new HashMap<>();
    tempMap.put("start", start);
    tempMap.put("end", end);
    return templateDao.list(tempMap);
  }

  @Override
  public void insert(Template template) {
    templateDao.insert(template);
    this.insertFile(template.getTemplateNo(), template.getUploadList());
  }

  private void insertFile(int templateNo, List<String> imageInfo) {
    Map<String, Object> imageMap = new HashMap<>();
    String fileName = imageInfo.get(0).toString();
    String newFileName = imageInfo.get(1).toString();
    String filePath = imageInfo.get(2).toString();
    imageMap.put("fileName", fileName);
    imageMap.put("newFileName", newFileName);
    imageMap.put("filePath", filePath);
    imageMap.put("templateNo", templateNo);
    System.out.println(imageMap);
    templateDao.insertFile(imageMap);
  }

  @Override
  public void update(Template template) {
    templateDao.update(template);
  }

  @Override
  public void delete(int templateNo) {
    templateDao.delete(templateNo);
  }

}
