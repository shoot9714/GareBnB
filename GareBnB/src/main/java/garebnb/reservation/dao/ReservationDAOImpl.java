package garebnb.reservation.dao;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("ReservationDAO")
public class ReservationDAOImpl implements ReservationDAO{
	
	protected Log log = LogFactory.getLog(ReservationDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId \t:  " + queryId);
		}
	}
	//일반회원이 예약내역 보기
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectMemReserveList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectList("reservation.selectMemReserveList", map);
	 }
	 
	 //일반회원이 이용내역 보기
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectOneResComList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectList("reservation.selectOneResComList", map);
	    }
	 
	 //호스트가 예약을 조회하기
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectReserve(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectList("reservation.selectReserve", map);
	    }
	 
	 //호스트가 거절사유를 입력
	 @Override
	 public void updateResReject(Map<String, Object> map) throws Exception{
			sqlSession.update("reservation.updateResReject", map);
		}
	 
	 //일반회원이 상세페이지에서 예약요청하기
	 public void insertOneReserve(Map<String, Object> map) throws Exception{
			sqlSession.insert("reservation.insertOneReserve", map);
		}
	 
	 //일반회원이 상세페이지에서 예약요청확인전 상세보는 페이지
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectList("reservation.selectReserveDetail", map);
	    }

}
