package org.sp.app0828.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//관리자와 관련된 로그인 요청을 처리하는 하위 컨트롤러
@Controller
public class LoginController {
	
	//로그인 폼 요청 처리 
	@RequestMapping(value="/admin/loginform", method=RequestMethod.GET)
	public ModelAndView getForm() {
		//3단계: 생략  (업무없다) 
		//4단계: 페이지명 등록 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/loginform");
		return mav;
	}
}







