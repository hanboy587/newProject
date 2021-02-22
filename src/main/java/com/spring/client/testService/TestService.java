package com.spring.client.testService;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.spring.client.testVO.TestVO;

@Service
public class TestService {
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<String> testList(TestVO testVO){
		return sqlSessionTemplate.selectList("testList");
	}
}
