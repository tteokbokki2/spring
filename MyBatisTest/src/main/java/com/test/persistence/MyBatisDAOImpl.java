package com.test.persistence;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.domain.MyBatisDTO;

@Repository
public class MyBatisDAOImpl implements MyBatisDAO{
	
	@Autowired
	private SqlSessionTemplate template;

	@Override
	public void test() {
		
		System.out.println(template == null);
		
	}

	@Override
	public int add(MyBatisDTO dto) {
		
		/*
			JDBC
			1. Connection
			2. Statement
			3. ResultSet
		
			MyBatis
			1. SqlSessionTemplate
				a. 반환값X
					- stat.executeUpdate()
					- template.insert()
					- template.update()
					- template.delete()
					
				b. 반환값O
					- stat.executeQuery()
					- template.selectOne() > 결과셋 레코드 1개
					- template.selectList() > 결과셋 레코드 N개
		*/
		
		//this.template.insert("매퍼 네임스페이스.쿼리 id", 인자값);
		return this.template.insert("mybatis.add", dto);
	}

	@Override
	public void m1() {
		
		//update tblMyBatis set age = age + 1;
		int result = this.template.update("mybatis.m1");
		
		System.out.println("적용된 행의 개수: " + result);
		
	}

	@Override
	public int m2(String seq) {
		
		return this.template.delete("mybatis.m2", seq);
		
	}

	@Override
	public int m3(MyBatisDTO dto) {
		
		return this.template.insert("mybatis.m3", dto);
	}

	@Override
	public int m4(HashMap<String, String> map) {
		
		return this.template.update("mybatis.m4", map);
	}

	@Override
	public int m5() {
		
		/*
			JDBC
			
			String sql = "";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				count = rs.getInt("count");
			}
			
			return count;
		*/
		
		
		return this.template.selectOne("mybatis.m5");
	}
	
	@Override
	public MyBatisDTO m6(String seq) {
		
		/*
			JDBC
			
			String sql = "";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			MyBatisDTO dto = new MyBatisDTO();
			
			if (rs.next()) {
				dto.serSeq(rs.getString("seq"));
				dto.serName(rs.getStirng("name"));
				dto.serAge(rs.getStirng("age"));
				..
			}
			
			return dto;
		 */
		
		return this.template.selectOne("mybatis.m6", seq);
		
	}
	
	@Override
	public List<String> m7() {
		
		/*
			JDBC
			
			String sql = "";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			List<String> names = new ArrayList<String>();
			
			while (rs.next()) {
				names.add(rs.getString("name"));
			}
			
			return list;
		*/
		
		return this.template.selectList("mybatis.m7");
	}
	
	@Override
	public List<MyBatisDTO> m8() {
		/*
			JDBC
			
			String sql = "";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			List<MyBatisDTO> names = new ArrayList<MyBatisDTO>();
			
			while (rs.next()) {
				MyBatisDTO dto = new MyBatisDTO();
				
				dto.serSeq(rs.getString("seq"));
				dto.serName(rs.getStirng("name"));
				dto.serAge(rs.getStirng("age"));
				..
				list.add(dto);
			}
			
			return list;
		*/
		return this.template.selectList("mybatis.m8");
	}
	
	@Override
	public int m9(String table) {
		
		return this.template.selectOne("mybatis.m9", table);
	}
	
	@Override
	public int m10() {

		return this.template.selectOne("mybatis.m10");
	}
	
	@Override
	public List<MyBatisDTO> m11(String word) {

		return this.template.selectList("mybatis.m11", word);
	}
	
	@Override
	public List<String> m12(String type) {
		
		return this.template.selectList("mybatis.m12", type);
	}
	
	@Override
	public List<MyBatisDTO> m13(HashMap<String, String> map) {
		
		return this.template.selectList("mybatis.m13", map);
	}
}
