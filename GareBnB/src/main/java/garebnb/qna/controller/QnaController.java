package garebnb.qna.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.qna.service.QnaService;

@Controller
public class QnaController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="qnaService")
	private QnaService qnaService;
}