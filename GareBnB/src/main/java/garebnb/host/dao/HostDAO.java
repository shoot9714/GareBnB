package garebnb.host.dao;

import java.util.Map;

public interface HostDAO {
	
	public Map<String, Object> selectHostDetail(Map<String,Object> map) throws Exception;
	
	
	
}
