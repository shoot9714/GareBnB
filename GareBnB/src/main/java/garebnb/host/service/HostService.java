package garebnb.host.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service("hostService")
public interface HostService {
	
	Map<String, Object> selectHostDetail(Map<String, Object> map) throws Exception;
	
	void insertHost(Map<String,Object> map, HttpServletRequest request) throws Exception;
	
	void updateHost(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	void deleteHost(Map<String, Object> map) throws Exception;
	
	Map<String, Object> selectHostList(Map<String, Object> map) throws Exception;
	

}
