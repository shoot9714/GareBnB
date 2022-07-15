package garebnb.review.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.board.service.BoardService;
import garebnb.common.common.CommandMap;
import garebnb.review.service.ReviewService;

@Controller
public class ReviewController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="reviewService")
	private ReviewService reviewService;
	
	
	//내 리뷰 보기
	@ResponseBody
	@RequestMapping(value="/mypage/myReview")
	public Map<String, Object> myReview(CommandMap commandMap) throws Exception{
		
    	return reviewService.selectmyReview(commandMap.getMap());
	}
	
	
	//리뷰 작성
	@ResponseBody
	@RequestMapping(value="/mypage/reviewPut")
	public void reviewWrite(CommandMap commandMap) throws Exception{
		reviewService.insertReview(commandMap.getMap());
	}
	
	
	//리뷰 리스트
	@ResponseBody
	@RequestMapping(value="/board/boardReview")
	public List<Map<String,Object>> boardReview(CommandMap commandMap) throws Exception{
		return reviewService.selectReviewList(commandMap.getMap());

	}
	
	
	//관리자-리뷰 삭제
	@ResponseBody
	@RequestMapping(value="/Admin/deleteReview")
	public void reviewDelete(CommandMap commandMap) throws Exception{
		reviewService.deleteReview(commandMap.getMap());
	}
	
	
	
}
