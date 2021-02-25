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
			//service 메서드는 정상적으로 실행되면 1을 반환하므로
			int cnt = testService.memberInsertPro(testVO);
			//cnt가 0보다 크면 정상 실행 -> 입력 정보들을 저장
			//"resultStr" 키에 "success"를 담아 view로 전달(ajax 처리)
			if(cnt > 0) {
				map.put("testVO", testVO);
				map.put("resultStr", "success");
			}else {
			//실패 시 "fail" 전달(ajax 처리)
				map.put("resultStr", "fail");
			}
		}catch(Exception e) {
			map.put("resutStr", "fail");
		}
		return map;
		
	}
}
