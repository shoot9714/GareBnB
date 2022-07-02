package garebnb.member.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.member.dao.MemberDAO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
}
