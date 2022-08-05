package garebnb.login.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.login.service.LoginService;

@Controller
public class LoginController {
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="loginService")
	private LoginService loginService;
	
	@ResponseBody
    @RequestMapping(value={"/login/findId"}) // 아이디 찾기, 아이디 찾기 결과  
    public Map<String, Object> selectOneId(CommandMap commandMap) throws Exception{
        return loginService.selectOneId(commandMap.getMap());

    }
	
	@ResponseBody
    @RequestMapping(value={"/login/findPwOK"}) // 아이디 찾기, 아이디 찾기 결과  
    public Map<String, Object> selectOnePw(CommandMap commandMap) throws Exception{
        return loginService.selectOnePw(commandMap.getMap());

    }
	
	@ResponseBody
	@RequestMapping(value= "/login/findPw") // 회원정보 수정 
	public void updateOneMember(CommandMap commandMap) throws Exception {
    	loginService.updateOnePw(commandMap.getMap());
	}
	
	@ResponseBody
    @RequestMapping(value={"/login/login"}) // 로그인 
    public Map<String, Object> selectId(CommandMap commandMap) throws Exception{
        String inputPassword = (String)commandMap.getMap().get("MEM_PW");
        if(loginService.selectId(commandMap.getMap()) == null) {
        	return null;
        } else {
			String realPassword = (String)loginService.selectId(commandMap.getMap()).get("MEM_PW");
	        if(inputPassword.equals(realPassword)) {
				return loginService.selectId(commandMap.getMap());
	        } 
	        else 
	        	return null;
        }
    }
	
	@ResponseBody
    @RequestMapping(value={"/Auth"}) // 인증 
    public Map<String, Object> selectAuth(CommandMap commandMap) throws Exception{
        return loginService.selectAuth(commandMap.getMap());

    }
	
	@ResponseBody
    @RequestMapping(value={"/login/IDCheck"}) // ID중복체크
    public Map<String, Object> selectIDCheck(CommandMap commandMap) throws Exception{
		String inputID = (String)commandMap.getMap().get("MEM_ID");
		if(loginService.selectIDCheck(commandMap.getMap()) == null) {
        	return null;
        } else {
			String realID = (String)loginService.selectIDCheck(commandMap.getMap()).get("MEM_ID");
	        if(inputID.equals(realID)) {
				return loginService.selectIDCheck(commandMap.getMap());
	        } 
	        else 
	        	return null;
        }

    }
	

	

}
