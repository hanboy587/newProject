package com.spring.client.testService;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.client.testVO.TestVO;

@Service
public class TestService {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<String> testList(TestVO testVO){
		return sqlSessionTemplate.selectList("testList");
	}
	
	public int memberInsertPro(TestVO testVO) {
		return sqlSessionTemplate.insert("memberInsertPro", testVO);
	}
}
