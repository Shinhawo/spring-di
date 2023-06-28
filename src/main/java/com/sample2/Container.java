package com.sample2;

public class Container {

	public static void main(String[] args) {
		
		// 1. 애플리케이션 실행에 필요한 객체 생성하기
		MySqlProductDao mySqlProductDao = new MySqlProductDao();
		CloudProductDao cloudProductDao = new CloudProductDao();
		
		ProductService productService = new ProductService();
		
		// 2. 객체들간의 의존관계를 조회해서 의존성 주입하기
		productService.setProductDao(cloudProductDao);
		
		// 3. 필요한 객체를 사용해서 업무로직 수행하기
		productService.상품입고처리();
	}
}
