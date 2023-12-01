package com.test.mapper;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
	
	//어노테이션(SQL 구현)
	//- 장점: 편리함
	//- 장점: 불편함 > SQL 문자열 표현
	@Select("select count(*) from tblAddress")
	String getTime();
	
	String getTime2();
	
}
