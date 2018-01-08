package digital.dao;

import java.util.Map;

import digital.domain.Admin;

public interface AdminDao {
  Admin selectOneByEmailPassword(Map<String,Object> valueMap);
  int insert(Admin admin);
  int delete(int adminNo);
  int update(Admin admin); 
}
