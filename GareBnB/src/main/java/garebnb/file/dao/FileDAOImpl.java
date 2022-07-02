package garebnb.file.dao;

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
}
