package org.sp.app0828.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//서브카테고리와 관련된 요청을 전담하는 하위 컨트롤러 
@Controller
public class SubCategoryController {
	
	//상위 카테고리에 소속된 하위 목록 가져오기 
	@GetMapping("/admin/subcategory/list")
	public ModelAndView getListByTopIdx(int topcategory_idx) {
		
		System.out.println("넘겨받은 top idx 는 "+topcategory_idx);
		
		return null;
	}
	
}











