package com.test.spring.domain;

import lombok.Data;

@Data
public class SpringDTO {

	private String name;
	private String age;
	private String address;
	
	//private String seq; //전혀 상관 없는 데이터 일 때
}
