package garebnb.board.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.board.dao.BoardDAOImpl;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name ="boardDAO")
	private BoardDAOImpl boarddao;
}
