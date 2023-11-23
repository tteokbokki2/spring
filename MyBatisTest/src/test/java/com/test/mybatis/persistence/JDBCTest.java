package com.test.mybatis.persistence;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

//JUnit
//Log4j

@Log4j
public class JDBCTest {
	
	@Test
	public void testConnection() {
		
		//JDBC 연결 확인
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "java1234");
			//Connection conn = null;
			
			assertNotNull(conn);
			
			System.out.println(conn.isClosed()); //log - 단순한 작업 시 사용
			
			log.info(conn.isClosed());
			//log.warn("경고 메세지");
			//log.error("에러 메세지");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
