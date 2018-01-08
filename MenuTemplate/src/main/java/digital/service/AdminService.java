package digital.service;

import digital.domain.Admin;

public interface AdminService {
  public Admin getByEmailPassword(String adminMail, String adminPassword) throws Exception;
  public void insert(Admin admin) throws Exception;
  public void update(Admin admin) throws Exception;
  public void delete(int adminNo) throws Exception;
}
