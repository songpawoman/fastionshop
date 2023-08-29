package org.sp.app0828.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//관리자모드에서의 상품과 관련된 요청을 처리하는 하위 컨트롤러

//component-scan  태그의 검색대상 중 @Controller 이므로, 자동으로 메모리에 생성
@Controller  
public class ProductController {
	
	@RequestMapping(value="/admin/product/registform", method=RequestMethod.GET)
	public String getForm() {
		//ModelAndView에 저장할 데이터가 없을 경우엔 뷰의 이름만 넘겨주면 되므로 
		//이때는 String형만 반환하자 
		return "admin/product/regist";
	}
	
}








