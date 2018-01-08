package digital.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.AdminDao;
import digital.domain.Admin;
import digital.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
  
  @Autowired
  AdminDao adminDao;

  @Override
  public void insert(Admin admin) throws Exception {
    adminDao.insert(admin);
  }

  @Override
  public void update(Admin admin) throws Exception {
    // TODO Auto-generated method stub
    adminDao.update(admin);
  }

  @Override
  public void delete(int adminNo) throws Exception {
    // TODO Auto-generated method stub
    adminDao.delete(adminNo);
  }

  @Override
  public Admin getByEmailPassword(String adminMail, String adminPassword) throws Exception {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("adminMail", adminMail);
    valueMap.put("adminPassword", adminPassword);
    
    return adminDao.selectOneByEmailPassword(valueMap);
  }

}
