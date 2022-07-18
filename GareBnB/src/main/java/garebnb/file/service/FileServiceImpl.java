package garebnb.file.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.file.dao.FileDAO;
import garebnb.file.util.fileUtils;

@Service("fileService")
public class FileServiceImpl implements FileService{
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="fileDAO")
	private FileDAO fileDAO;
	
	@Resource(name="fileUtils")
	private fileUtils fileUtils;

	@Override
	public List<Map<String, Object>> selectFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return fileDAO.selectFile(map); 
	}
	
	@Override
	public Map<String,Object> selectOneFile(Map<String,Object> map) throws Exception{
		
		return fileDAO.selectOneFile(map);
	}

	@Override
	public void updateFile(Map<String, Object> map ,HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		fileDAO.deleteFile(map);
		List<Map<String,Object>> list = fileUtils.parseUpdateFileInfo(map, request);
		Map<String,Object> tempMap = null;
		for(int i=0, size=list.size(); i<size; i++){
			tempMap = list.get(i);
			if(tempMap.get("IS_NEW").equals("Y")){
				fileDAO.insertFile(tempMap);
			}
			else{
				fileDAO.updateFile(tempMap);
			}
		}		
	}

	@Override
	public void insertFile(Map<String, Object> map , HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for(int i=0, size=list.size(); i<size; i++){
			fileDAO.insertFile(list.get(i));
		}
	}

	@Override
	public void deleteFile(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		fileDAO.deleteFile(map);
		
	}
}
