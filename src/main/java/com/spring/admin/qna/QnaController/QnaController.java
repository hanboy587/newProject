package com.spring.admin.qna.QnaController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.admin.qna.QnaService.QnaService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class QnaController {

	@Autowired
	private QnaService QnaService;
	
	@RequestMapping(value="/qnaList")
	public ModelAndView Qna() {
		ModelAndView list = new ModelAndView();
		return list;
	}
	
	@RequestMapping(value="/qnaView")
	public Map<String, Object> qnaView() {
		Map<String, Object> map = new HashMap<>();
		return map;
	}
	
	@RequestMapping(value="/qnaCRUD")
	public Map<String, Object> qnaCRUD() {
		Map<String,Object> map = new HashMap<>();
		return map;
	}
	
}
