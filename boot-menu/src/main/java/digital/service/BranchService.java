package digital.service;

import java.util.List;

import digital.domain.Branch;

public interface BranchService {
	  List<Branch> list(int pageNo, int pageSize) throws Exception;
	  Branch get(int no) throws Exception;
	  void add(Branch branch) throws Exception;
//	  void update(Branch branch) throws Exception;
	  void remove(int no) throws Exception;
}
