package garebnb.file.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("FileDAO")
public interface FileDAO {
	public Map<String, Object> selectFile(Map<String,Object> map) throws Exception;

	public void insertFile(Map<String,Object> map) throws Exception;
	
	public void deleteFile(Map<String,Object> map) throws Exception;
	
	public void updateFile(Map<String,Object> map) throws Exception;
}
