package garebnb.host.service;

import java.util.HashMap;
import java.util.List;
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
		return hostDAO.selectHostDetail(map);
	}

	@Override
	public void updateOneHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		hostDAO.updateOneHost(map);
	}

	@Override
	public List<Map<String, Object>> selectHostConfrimList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hostDAO.selectHostConfrimList(map);
	}

	
	@Override
	public void updateOneMemberDelete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		hostDAO.updateOneMemberDelete(map);
	}

	@Override
	public Map<String, Object> selectConfrimMemberDetail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hostDAO.selectConfrimMemberDetail(map);
	}

	@Override
	public void updateHostConfirm(Map<String, Object> map) {
		// TODO Auto-generated method stub
		hostDAO.updateHostConfirm(map);
	}

	@Override
	public void updateHostDeny(Map<String, Object> map) {
		// TODO Auto-generated method stub
		hostDAO.updateHostDeny(map);
	}


}
