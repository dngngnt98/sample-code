package digital.service;

import java.util.List;

import digital.domain.Template;

public interface TemplateService {
  public List<Template> list(int start, int end);
  public void insert(Template template);
  public void update(Template template);
  public void delete(int templateNo);
}
