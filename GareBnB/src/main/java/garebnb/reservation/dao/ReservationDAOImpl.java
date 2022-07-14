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
	//�씪諛섑쉶�썝�씠 �삁�빟�궡�뿭 蹂닿린
	 @SuppressWarnings("unchecked")
	    @Override
	    public List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (List<Map<String , Object>>) sqlSession.selectList("reservation.selectMemReserveList", map);
	 }
	 
	 //�씪諛섑쉶�썝�씠 �씠�슜�궡�뿭 蹂닿린
	 @SuppressWarnings("unchecked")
	    @Override
	    public List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (List<Map<String , Object>>) sqlSession.selectList("reservation.selectOneResComList", map);
	    }
	 
	 //�샇�뒪�듃媛� �삁�빟�쓣 議고쉶�븯湲�
	 @SuppressWarnings("unchecked")
	    @Override
	    public List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (List<Map<String , Object>>) sqlSession.selectList("reservation.selectReserve", map);
	    }
	 
	 //�샇�뒪�듃媛� 嫄곗젅�궗�쑀瑜� �엯�젰
	 @Override
	 public void updateResReject(Map<String, Object> map) throws Exception{
			sqlSession.update("reservation.updateResReject", map);
		}
	 
	 //�씪諛섑쉶�썝�씠 �긽�꽭�럹�씠吏��뿉�꽌 �삁�빟�슂泥��븯湲�
	 public void insertOneReserve(Map<String, Object> map) throws Exception{
			sqlSession.insert("reservation.insertOneReserve", map);
		}
	 
	 //�씪諛섑쉶�썝�씠 �긽�꽭�럹�씠吏��뿉�꽌 �삁�빟�슂泥��솗�씤�쟾 �긽�꽭蹂대뒗 �럹�씠吏�
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectList("reservation.selectReserveDetail", map);
	    }

}
