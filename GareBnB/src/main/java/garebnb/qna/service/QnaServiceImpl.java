package garebnb.qna.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.qna.dao.QnaDAO;

@Service("qnaService")
public class QnaServiceImpl implements QnaService{

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="qnaDAO")
	private QnaDAO qnaDAO;
}
