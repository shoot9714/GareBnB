//package garebnb.board.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import garebnb.board.service.BoardService;
//import garebnb.common.common.CommandMap;
//
//@Controller
//public class BoardController {
//	Logger log = Logger.getLogger(this.getClass());
//
//	@Resource(name="boardService")
//	private BoardService boardService;
//	
//	@ResponseBody
//	@RequestMapping(value="/board/boardList")
//	public Map<String, Object> boardList(CommandMap commandMap) throws Exception{
//		Map<String, Object> Json = new HashMap<String, Object>();
//        Map<String,Object> map = boardService.selectBoardList(commandMap.getMap());
//        Json.put("map", map.get("map"));
//
//        return Json;
//	}
//
//
//}
