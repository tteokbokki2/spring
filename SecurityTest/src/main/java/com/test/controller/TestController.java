package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping(value = "/index.do")
	public String index() {
	
		//모든 사용자
		
		return "index";
	}
	
	@GetMapping(value = "/member/member.do")
	public String member() {
		
		//회원 전용(+ 관리자 접속 가능)
		
		return "/member/member";
	}
	
	@GetMapping(value = "/admin/admin.do")
	public String admin() {
		
		//관리자 전용
		
		return "/admin/admin";
	}
	
	
}
