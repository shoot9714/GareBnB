package garebnb.file.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.file.service.FileService;

@Controller
public class FileController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="fileService")
	private FileService  fileService;
	
	@ResponseBody
	@RequestMapping(value="/file/download.do")
	public List<Map<String,Object>> downloadFile(CommandMap commandMap) throws Exception{
		List<Map<String, Object>> list = fileService.selectFile(commandMap.getMap());
		List<Map<String,Object>> returnList = new ArrayList<Map<String,Object>>();
		
		for(int i = 0; i<list.size(); i++) {
			Map<String,Object> returnMap = new HashMap<String, Object>();
			Map<String,Object> map = list.get(i);
			String storedFileName = (String)map.get("FILE_STDNAME");
			String File_Level = null;
			if(map.get("FILE_LEVEL").equals("0")) {
				File_Level = "main";
			} else {
				File_Level = "sub";
			}
			byte fileByte[] = FileUtils.readFileToByteArray(new File("/Users/jinkim/Documents/upload/"+storedFileName));
			returnMap.put(File_Level, fileByte);
			returnList.add(returnMap);
			
		}
		return returnList;
	}

	@ResponseBody
	@RequestMapping(value="/file/update.do")
	public void updateFile(CommandMap commandMap, HttpServletRequest request) throws Exception{
		fileService.updateFile(commandMap.getMap(),request);
	}
	@ResponseBody
	@RequestMapping(value="/file/delete.do")
	public void deleteFile(CommandMap commandMap) throws Exception{
		fileService.deleteFile(commandMap.getMap());
	}
	@ResponseBody
	@RequestMapping(value="/file/insert.do")
	public String insertFile(CommandMap commandMap, HttpServletRequest request) throws Exception{
		fileService.insertFile(commandMap.getMap(), request);
		return "업로드 성공";
	}
}
