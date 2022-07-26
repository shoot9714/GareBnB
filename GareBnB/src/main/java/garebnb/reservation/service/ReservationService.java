package garebnb.reservation.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service("reservationService")
public interface ReservationService {
	
	List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception;

	List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception;

	void updateResReject(Map<String, Object> map) throws Exception;

	void insertOneReserve(Map<String, Object> map) throws Exception;

	Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception;

}
