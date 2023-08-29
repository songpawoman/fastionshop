package org.sp.app0828.domain;

import lombok.Data;

@Data
public class Product {
	private int product_idx;
	private SubCategory subCategory; //DB 관계에서의 부모 DTO 보유
	private String product_name;
	private String brand;
	private int price;
	private String detail;
	
}


