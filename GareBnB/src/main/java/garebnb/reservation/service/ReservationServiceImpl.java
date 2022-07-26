package garebnb.reservation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import garebnb.reservation.dao.ReservationDAO;

@Repository("ReservationService")
public class ReservationServiceImpl implements ReservationService{

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="ReservationDAO")
	private ReservationDAO reservationDAO;
	
	
	
	@Override
	public void updateResCancel(Map<String, Object> map) {
		// TODO Auto-generated method stub
		reservationDAO.updateResCancel(map);
	}

	@Override
	public void updateResConfirm(Map<String, Object> map) {
		// TODO Auto-generated method stub
		reservationDAO.updateResConfirm(map);
	}

	@Override
	public List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception {
		return reservationDAO.selectMemReserveList(map);
	}
	
	@Override
	public List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception {
		return reservationDAO.selectOneResComList(map);
	}
	
	@Override
	public List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception {
		return reservationDAO.selectReserve(map);
	}
	
	@Override
	public void updateResReject(Map<String, Object> map) throws Exception{
		reservationDAO.updateResReject(map);
		
	}
	@Override
	public void insertOneReserve(Map<String, Object> map) throws Exception{
		reservationDAO.insertOneReserve(map);
	}
	@Override
	public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception {
		return reservationDAO.selectReserveDetail(map);
	}
}
