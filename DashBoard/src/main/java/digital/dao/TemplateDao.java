package digital.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import digital.domain.Template;

public interface TemplateDao {
  public List<Template> list(HashMap<String, Object> tempMap);
  public void insert(Template template);
  public void update(Template template);
  public void delete(int templateNo);
  public void insertFile(Map<String, Object> imageMap);
}
