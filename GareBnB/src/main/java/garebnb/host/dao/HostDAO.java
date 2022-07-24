package garebnb.host.dao;

import java.util.List;
import java.util.Map;

public interface HostDAO {
	
	public Map<String, Object> selectHostDetail(Map<String,Object> map) throws Exception;
	
	
	//호스트회원정보수정
	public void updateOneHost(Map<String,Object> map) throws Exception;
	
	//호스트회원등록요청리스트
	public List<Map<String, Object>> selectHostConfrimList(Map<String, Object> map);


	public void updateOneMemberDelete(Map<String, Object> map);

	public Map<String, Object> selectConfrimMemberDetail(Map<String, Object> map);

	public void updateHostConfirm(Map<String, Object> map);

	public void updateHostDeny(Map<String, Object> map);
}
