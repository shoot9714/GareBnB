package garebnb.report.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.report.service.ReportService;

@Controller
public class ReportController {
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="reportService")
	private ReportService reportService;
	
	
	//1. 일반회원 + 호스트
	//신고내역 - 일반회원
	@ResponseBody 
	@RequestMapping(value="/mypage/memReportList.do")
	public Map<String, Object> memReportList(CommandMap commandMap, HttpServletRequest request) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
		
//		HttpSession session = request.getSession();
//		String id = (String) session.getAttribute("MEM_ID"); //세션에서 아이디
//		commandMap.put("QNA_ID", id); //??
		
        List<Map<String, Object>> resultMap = reportService.selectOneReportList(commandMap.getMap());
        Json.put("map", resultMap);

        return Json;
	}
	
	//신고내역 - 호스트
	@ResponseBody 
	@RequestMapping(value="/host/mypage/hostReportList.do")
	public Map<String, Object> hostReportList(CommandMap commandMap, HttpServletRequest request) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
		
//		HttpSession session = request.getSession();
//		String id = (String) session.getAttribute("MEM_ID"); //세션에서 아이디
//		commandMap.put("QNA_ID", id); //??
		
        List<Map<String, Object>> resultMap = reportService.selectOneReportList(commandMap.getMap());
        Json.put("map", resultMap);

        return Json;
	}
	
	
	//일반회원 -> 호스트회원 신고 - 입력
	@RequestMapping(value="/mypage/memReportInsert.do")
	@ResponseBody
	public Map<String, Object> memReportInsert(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
			
		reportService.insertReport(commandMap.getMap());
	        
	    return Json;
	}
	
	
	//호스트회원 -> 일반회원 신고 - 입력
	@RequestMapping(value="host/mypage/hostReportInsert.do")
	@ResponseBody
	public Map<String, Object> hostReportInsert(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
			
		reportService.insertHostReport(commandMap.getMap());
	        
	    return Json;
	}
	
	
	//2.관리자
	//신고 내역 리스트
	@ResponseBody 
	@RequestMapping(value="/Admin/reportList.do")
	public Map<String, Object> reportList(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
		
        List<Map<String, Object>> resultMap = reportService.selectAdminReportList(commandMap.getMap());
        Json.put("map", resultMap);

        return Json;
	}
	
	//신고 내역 디테일
	@ResponseBody 
	@RequestMapping(value="/Admin/reportDetail.do")
	public Map<String, Object> reportDetail(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
		
        List<Map<String, Object>> resultMap = reportService.selectAdminOneReport(commandMap.getMap());
        Json.put("map", resultMap);

        return Json;
	}
	
	//신고 답변
	@RequestMapping(value="/Admin/reportComment.do")
	@ResponseBody 
	public Map<String, Object> reportComment(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
        reportService.updateReportComment(commandMap.getMap());
	        
	        return Json;
		}	
}
