package garebnb.reservation.service;

import java.util.List;
import java.util.Map;

import first.sample.service.HttpServletRequest;

public interface ReservationService {
	
	List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception;

	List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception;

	void updateResReject(Map<String, Object> map, HttpServletRequest request) throws Exception;

	void insertOneReserve(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

}
