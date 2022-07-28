package garebnb.member.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import garebnb.member.dao.MemberDAO;

@Repository("memberService")
public class MemberServiceImpl implements MemberService {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="memberDAO")
	private MemberDAO memberDAO;

	@Override
	public void insertMember(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.insertMember(map);
		
	}
	
	@Override
	public Map<String, Object> selectMemDetail(Map<String, Object> map) throws Exception { // 일반 회원 상세 보기 
		// TODO Auto-generated method stub
		return memberDAO.selectMemDetail(map);
	}


	@Override
	public int selectMemberDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberDetail(map);
	}

	@Override
	public void updateOneMember(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.updateOneMember(map);
	}

	@Override
	public void updateOneMemberDelete(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.updateOneMemberDelete(map);
	}


	@Override
	public List<Map<String, Object>> selectMemberList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberList(map);
	}

	@Override
	public List<Map<String, Object>> selectHostConfirmList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectHostConfirmList(map);
	}

	@Override
	public Map<String, Object> selectConfirmMemberDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectConfirmMemberDetail(map);
	}

	@Override
	public void updateMemberDeny(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.updateMemberDeny(map);
	}


	@Override
	public void updateHostConfirm(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.updateHostConfirm(map);
	}


	@Override
	public void updateHostDeny(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.updateHostDeny(map);
	}
	
	@Override
	public void insertHostMem(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.insertHostMem(map);
		
	}

}