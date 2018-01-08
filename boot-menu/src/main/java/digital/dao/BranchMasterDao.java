package digital.dao;

import java.util.List;
import java.util.Map;

import digital.domain.BranchMaster;

public interface BranchMasterDao {
	List<BranchMaster> selectList(Map<String,Object> valueMap); // Branch Master 리스트 기능
	BranchMaster selectOne(int no); // Branch Maseter 개인의 상세 정보 보기 기능
	BranchMaster selectOneByEmailPassword(Map<String,Object> valueMap); // Branch Master 로그인 기능
	int insert(BranchMaster branchMaster); // Branch Master 정보 추가
	int delete(int no); // Branch Master 정보 삭제
	int update(BranchMaster branchMaster); // Branch Master 정보 수정
}
