package garebnb.reservation.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.reservation.service.ReservationService;

@Controller
public class ReservationController {
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="ReservationService")
	private ReservationService reservationService;
	
	
	//클라이언트 예약취소
	@ResponseBody
	@RequestMapping(value="/mypage/ResCancel") 
	public void resCancel(CommandMap commandMap) throws Exception {
		reservationService.updateResCancel(commandMap.getMap());
	}
	
	//클라이언트 예약확정
	@ResponseBody
	@RequestMapping(value= "/mypage/ResConfirm") 
	public void resConfirm(CommandMap commandMap) throws Exception {
		reservationService.updateResConfirm(commandMap.getMap());
	}
	
	//클라이언트가 보는 예약내역 조회
	@ResponseBody
	@RequestMapping(value="/mypage/memReserveList")
	public List<Map<String,Object>> memReserveList(CommandMap commandMap) throws Exception{
		return reservationService.selectMemReserveList(commandMap.getMap());
	}
	
	//클라이언트가 보는 이용내역 조회
	@ResponseBody
	@RequestMapping(value="/mypage/memuseList")
	public List<Map<String,Object>> memUseList(CommandMap commandMap) throws Exception{
		return reservationService.selectOneResComList(commandMap.getMap());

	}
	
	//호스트가 보는 예약내역 조회
	@ResponseBody
	@RequestMapping(value="/host/mypage/resList")
	public List<Map<String,Object>> resList(CommandMap commandMap) throws Exception{
		return reservationService.selectReserve(commandMap.getMap());
	}
	
	//호스트가 예약거절사유입력
	@ResponseBody
    @RequestMapping(value= "/host/mypage/resRejectPut") 
    public void resRejectPut(CommandMap commandMap) throws Exception {
        reservationService.updateResReject(commandMap.getMap());
    }
	
	//게시판 상세페이지에서 예약 요청
	@ResponseBody
    @RequestMapping(value= "/mypage/resRequest") 
    public void resRequest(CommandMap commandMap) throws Exception {
        reservationService.insertOneReserve(commandMap.getMap());
    }
	
	//예약요청전 상세보기
	@ResponseBody
	@RequestMapping(value="/mypage/resRequestDetail")
	public Map<String, Object> resRequestDetail(CommandMap commandMap) throws Exception{
		
    	return reservationService.selectReserveDetail(commandMap.getMap());
	}
	
	
	//예약상태 결제/예약완료로 변경,결제정보 insert
	@ResponseBody
    @RequestMapping(value= "/mypage/resPay") 
    public void resPay(CommandMap commandMap) throws Exception {
        reservationService.resPay(commandMap.getMap());
    }
	
	//결제 리스트 조회
	@ResponseBody
	@RequestMapping(value="/Admin/payList")
	public List<Map<String,Object>> payList(CommandMap commandMap) throws Exception{
		return reservationService.selectPayList(commandMap.getMap());

	}
	
}

















