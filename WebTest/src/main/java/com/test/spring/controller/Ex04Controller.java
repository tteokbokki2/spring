package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value="/ex04.do")
public class Ex04Controller {
	
	@RequestMapping(value="/ex04.do") //가상주소는 컨트롤러 밑에 붙혀도 되고 요청 메서드에 붙혀도 됨
	public String ex04() {
		
		return "ex04";
	}
	
	@RequestMapping("/ex04_1.do") //value 생략 가능
	public String ex04_1() {
		
		return "ex04_1";
	}
	
	
}
