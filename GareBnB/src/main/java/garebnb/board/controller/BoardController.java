package garebnb.board.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import garebnb.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping(value="/host/mypage/myboardList")
	public ModelAndView myboardList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("");
		log.debug("인터셉트 테스트");
		
		return mv;
	}
}
