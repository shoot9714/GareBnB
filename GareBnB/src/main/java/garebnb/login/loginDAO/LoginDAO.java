package garebnb.login.loginDAO;

import java.util.Map;

public interface LoginDAO {
	
	public Map<String, Object> selectOneId(Map<String,Object> map) throws Exception; 
	
	public Map<String, Object> selectOnePw(Map<String,Object> map) throws Exception;

	public Map<String, Object> selectId(Map<String,Object> map) throws Exception;
}
