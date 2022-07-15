package garebnb.host.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import garebnb.host.dao.HostDAO;

@Repository("hostService")
public class HostServiceImpl implements HostService{
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="hostDAO")
	private HostDAO hostDAO;

	@Override
	public Map<String, Object> selectHostDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		Map<String , Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> tempMap = hostDAO.selectHostDetail(map);
		
		resultMap.put("map", tempMap);
		return resultMap;
	}

	@Override
	public void insertHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		hostDAO.insertHost(map);
		
	}

	@Override
	public void updateHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		hostDAO.updateHost(map);
		
	}

	@Override
	public void deleteHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		hostDAO.deleteHost(map);
		
	}

}
