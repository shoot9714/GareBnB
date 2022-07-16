package garebnb.file.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface FileService {
	
	List<Map<String, Object>> selectFile(Map<String,Object> map) throws Exception;

	void updateFile(Map<String,Object> map, HttpServletRequest request) throws Exception;
		
	void deleteFile(Map<String,Object> map) throws Exception;

	void insertFile(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Map<String, Object> selectOneFile(Map<String, Object> map) throws Exception;
}
