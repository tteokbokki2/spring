package com.test.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.domain.CustomUser;
import com.test.domain.MemberDTO;
import com.test.mapper.MemberMapper;

//모든 계정 정보를 담당

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//DB 상에서 회원 정보 읽어서 인증 객체 대입
		
		//username == 아이디
		MemberDTO dto = mapper.read(username);
		
		//MemberDTO > 시큐리티에서 사용(변환) > CustomUser
		
		return dto != null? new CustomUser(dto) : null;
	}
	

}
