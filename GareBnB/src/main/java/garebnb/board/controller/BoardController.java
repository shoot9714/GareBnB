package garebnb.board.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="BoardService")
	private BoardService boardService;
	
}
