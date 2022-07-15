package garebnb.file.controller;

import java.io.File;
import java.net.URLEncoder;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public byte[] img(CommandMap commandMap) throws Exception{
		Map<String,Object> map = fileService.selectFile(commandMap.getMap());
		String storedFileName = (String)map.get("STORED_FILE_NAME");
		String originalFileName = (String)map.get("ORIGINAL_FILE_NAME");
		
		byte fileByte[] = FileUtils.readFileToByteArray(new File("/Users/jinkim/Documents/upload/"+storedFileName));
		
		return fileByte;
	}
	
	@RequestMapping(value="/file/update.do")
	public void updateFile(CommandMap commandMap) throws Exception{
		fileService.updateFile(commandMap.getMap());
	}
	
	@RequestMapping(value="/file/delete.do")
	public void deleteFile(CommandMap commandMap) throws Exception{
		fileService.deleteFile(commandMap.getMap());
	}
	
	@RequestMapping(value="/file/insert.do")
	public void insertFile(CommandMap commandMap, HttpServletRequest request) throws Exception{
		fileService.insertFile(commandMap.getMap(), request);
	}
}
