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
	public ModelAndView Test() {
		//controller에서 사용할 객체 선언부
		ModelAndView mav = new ModelAndView();
		TestVO test = new TestVO();
		Map<String, Object> map = new HashMap<String,Object>();
		System.out.println("testList 컨트롤러 실행!!!!!!!!!!!!!!!!!!!!!!!");
		
		//service에서 mybatis와 연동된 메서드를 가져와 map에 put
		map.put("list", testService.testList(test));
		
		
		//addObject("view단에서 접근할 이름", view단에 전달할 데이터)
		//setViewName("데이터를 보낼 jsp 파일 이름")
		mav.addObject("map",map);
		mav.setViewName("test");
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!"+map.get("list"));
		return mav;
	}
}
