package garebnb.file.dao;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("fileDAO")
public class FileDAOImpl implements FileDAO{
	
	protected Log log = LogFactory.getLog(FileDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId \t:  " + queryId);
		}
	}

	@Override
	public Map<String, Object> selectFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.selectList("file.selectFile",map);
		return null;

	}

	@Override
	public void insertFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("file.insertFile",map);
	}

	@Override
	public void deleteFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("file.deleteFile", map);
	}

	@Override
	public void updateFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("file.updateFile", map);
	}
}
