package com.spring.client.memberService;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.client.memberVO.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	private String pushTest2;
	private String pushTestOneMore17;
	
	public List<String> memberList(MemberVO memberVO){
		return sqlSessionTemplate.selectList("memberList");
	}
	
	public int memberInsertPro(MemberVO memberVO) {
		System.out.println("insert service : " + memberVO);
		return sqlSessionTemplate.insert("memberInsertPro", memberVO);
	}
}
