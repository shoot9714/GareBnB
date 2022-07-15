package garebnb.host.dao;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("hostDAO")
public class HostDAOImpl implements HostDAO {
	
	protected Log log = LogFactory.getLog(HostDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId \t:  " + queryId);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> selectHostDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return (Map<String , Object>) sqlSession.selectOne("host_member.selectOneHost", map);
	}

	@Override
	public void insertHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("host_member.insertHostMem",map);
	}

	@Override
	public void updateHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("host_member.updateOneHost",map);
	}

	@Override
	public void deleteHost(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("host_member.updateOneHostDelete", map);
	}

	
}
