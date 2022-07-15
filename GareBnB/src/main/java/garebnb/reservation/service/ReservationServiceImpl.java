//package garebnb.reservation.service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Service;
//
//import first.sample.service.HttpServletRequest;
//import garebnb.reservation.dao.ReservationDAO;
//
//@Service("reservationService")
//public class ReservationServiceImpl implements ReservationService{
//
//	Logger log = Logger.getLogger(this.getClass());
//
//	@Resource(name="reservationDAO")
//	private ReservationDAO reservationDAO;
//	
//	@Override
//	public List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception {
//		return sampleDAO.selectMemReserveList(map);
//	}
//	
//	@Override
//	public List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception {
//		return sampleDAO.selectOneResComList(map);
//	}
//	
//	@Override
//	public List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception {
//		return sampleDAO.selectReserve(map);
//	}
//	
//	@Override
//	public void updateResReject(Map<String, Object> map, HttpServletRequest request) throws Exception{
//		sampleDAO.updateResReject(map);
//		
//	}
//	@Override
//	public void insertOneReserve(Map<String, Object> map, HttpServletRequest request) throws Exception {
//		sampleDAO.insertOneReserve(map);
//	}
//	@Override
//	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception {
//		sampleDAO.selectBoardDetail(map);
//	}
//}
