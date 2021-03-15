package com.spring.client.memberController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.client.memberService.MemberService;
import com.spring.client.memberVO.MemberVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MemberContorller {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/memberList")
	public ModelAndView Test() {
		//controller���� ����� ��ü �����
		ModelAndView mav = new ModelAndView();
		MemberVO member = new MemberVO();
		Map<String, Object> map = new HashMap<String,Object>();
		System.out.println("memberList ��Ʈ�ѷ� ����!!!!!!!!!!!!!!!!!!!!!!!");
		
		//service���� mybatis�� ������ �޼��带 ������ map�� put
		map.put("list", memberService.memberList(member));
		
		
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
	
	@RequestMapping(value="/memberInsertPro",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> memberInsertPro(MemberVO memberVO, HttpServletRequest request){
		Map<String, Object> map = new HashMap<>();
		System.out.println("��Ʈ�ѷ��� ���޵� ���� : "+ request.getParameter("member_email"));
		
		try {
			//service �޼���� ���������� ����Ǹ� 1�� ��ȯ�ϹǷ�
			int cnt = memberService.memberInsertPro(memberVO);
			//cnt�� 0���� ũ�� ���� ���� -> �Է� �������� ����
			//"resultStr" Ű�� "success"�� ��� view�� ����(ajax ó��)
			if(cnt > 0) {
				map.put("memberVO", memberVO);
				System.out.println("!!!!!!!!!!!"+map.get("memberVO"));
				map.put("resultStr", "success");
			}else {
			//���� �� "fail" ����(ajax ó��)
				System.out.println("else!!!!!!!!!!!"+map.get("memberVO"));
				map.put("resultStr", "fail");
			}
		}catch(Exception e) {
			System.out.println("catch!!!!!!!!!!!"+map.get("memberVO"));
			map.put("resultStr", "fail");
		}
	
		return map;
		
	}
}
