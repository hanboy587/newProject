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
		//controller���� ����� ��ü �����
		TestVO test = new TestVO();
		Map<String, Object> map = new HashMap<String,Object>();
		
		//service���� mybatis�� ������ �޼��带 ������ map�� put
		map.put("list", testService.testList(test));
		
		//addObject("view�ܿ��� ������ �̸�", view�ܿ� ������ ������)
		//setViewName("�����͸� ���� jsp ���� �̸�")
		model.addObject("map",map);
		model.setViewName("test");
		
		return map;
	}
}
