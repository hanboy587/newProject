package com.spring.client.testController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		//controller���� ����� ��ü �����
		ModelAndView mav = new ModelAndView();
		TestVO test = new TestVO();
		Map<String, Object> map = new HashMap<String,Object>();
		System.out.println("testList ��Ʈ�ѷ� ����!!!!!!!!!!!!!!!!!!!!!!!");
		
		//service���� mybatis�� ������ �޼��带 ������ map�� put
		map.put("list", testService.testList(test));
		
		
		//addObject("view�ܿ��� ������ �̸�", view�ܿ� ������ ������)
		//setViewName("�����͸� ���� jsp ���� �̸�")
		mav.addObject("map",map);
		mav.setViewName("test");
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!"+map.get("list"));
		return mav;
	}
	
	@RequestMapping(value="/memberInsert")
	public Map<String, Object> memberInsert(){
		Map<String, Object> map = new HashMap<>();
		
		return map;
		
	}
	
	@RequestMapping(value="/memberInsertPro")
	@ResponseBody
	public Map<String, Object> memberInsertPro(TestVO testVO){
		Map<String, Object> map = new HashMap<>();
		
		try {
			//service �޼���� ���������� ����Ǹ� 1�� ��ȯ�ϹǷ�
			int cnt = testService.memberInsertPro(testVO);
			//cnt�� 0���� ũ�� ���� ���� -> �Է� �������� ����
			//"resultStr" Ű�� "success"�� ��� view�� ����(ajax ó��)
			if(cnt > 0) {
				map.put("testVO", testVO);
				map.put("resultStr", "success");
			}else {
			//���� �� "fail" ����(ajax ó��)
				map.put("resultStr", "fail");
			}
		}catch(Exception e) {
			map.put("resutStr", "fail");
		}
		return map;
		
	}
}
