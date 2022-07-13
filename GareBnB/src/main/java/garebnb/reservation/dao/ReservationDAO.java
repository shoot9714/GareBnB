package garebnb.reservation.dao;

import java.util.Map;

public interface ReservationDAO {
	
	public Map<String, Object> selectMemReserveList(Map<String, Object> map) throws Exception; 

	public Map<String, Object> selectOneResComList(Map<String, Object> map) throws Exception; 
	
	public Map<String, Object> selectReserve(Map<String, Object> map) throws Exception;

	public void updateResReject(Map<String, Object> map) throws Exception;

	public void insertOneReserve(Map<String, Object> map) throws Exception;

	public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception;
}
