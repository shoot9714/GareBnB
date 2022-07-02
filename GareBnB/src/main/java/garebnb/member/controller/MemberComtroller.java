package garebnb.member.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.member.service.MemberService;

@Controller
public class MemberComtroller {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="memberService")
	private MemberService memberService;
}
