package com.sw.r1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	//memberJoin	//	/member/memberJoin GET
	@RequestMapping(value="/member/memberLogin")
	public String memberLogin() {
		System.out.println();
		return "member/memberLogin";
	}

	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public void memberLogin2(MemberDTO memberDTO) throws Exception {
		memberDTO.("id");
		
		
		
	}
	
	
	
	
	
	
	
	
}
