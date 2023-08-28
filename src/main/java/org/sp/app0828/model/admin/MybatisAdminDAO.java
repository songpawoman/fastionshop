package org.sp.app0828.model.admin;

import org.sp.app0828.domain.Admin;
import org.springframework.stereotype.Repository;

//이 클래스는 AdminDAO  형 中 중 하나이다..
//component-scan에 의해 DAO의 인스턴스를 생성해준다(스프링이..)
@Repository
public class MybatisAdminDAO implements AdminDAO{
	
	public Admin login(Admin admin) {
		return null;
	}
	
	public void insert(Admin admin) {
	}
	
}
