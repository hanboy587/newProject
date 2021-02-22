package com.spring.client.testController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.client.testService.TestService;
import com.spring.client.testVO.TestVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TestContorller {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testList")
	public Map<String, Object> Test(ModelAndView model) {
		//controller에서 사용할 객체 선언부
		TestVO test = new TestVO();
		Map<String, Object> map = new HashMap<String,Object>();
		
		//service에서 mybatis와 연동된 메서드를 가져와 map에 put
		map.put("list", testService.testList(test));
		
		//addObject("view단에서 접근할 이름", view단에 전달할 데이터)
		//setViewName("데이터를 보낼 jsp 파일 이름")
		model.addObject("map",map);
		model.setViewName("test");
		
		return map;
	}
}
