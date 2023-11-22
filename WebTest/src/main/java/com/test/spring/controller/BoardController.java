package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	//- "/spring/board/list.do"
	//- "/spring/board/add.do"
	//- "/spring/board/addok.do"
	//- "/spring/board/view.do"
	
	//- doGet() 역할
	@RequestMapping(value="/list.do", method={RequestMethod.GET, RequestMethod.POST}) //GET, POST 둘 다 받으려면 생략해도 되고 이런식으로 표현도 가능 
	public String list() {
		
		//WEB-INF/views/board/list.jsp
		return "board/list";
	}

	//- doGet() 역할
	@RequestMapping(value="/add.do", method=RequestMethod.GET)
	public String add() {
		
		return "board/add";
	}

	//- doPost() 역할
	@RequestMapping(value="/addok.do", method=RequestMethod.POST)
	public String addok() {
		
		return "board/addok";
	}
	
	//- doGet() 역할
	@RequestMapping(value="/view.do", method=RequestMethod.GET)
	public String view() {
		
		return "board/view";
	}
	
}
