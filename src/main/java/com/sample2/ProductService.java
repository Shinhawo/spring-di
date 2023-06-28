package com.sample2;

public class ProductService {

	// 1. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 참조할 수 있는 멤버변수
	private ProductDao productDao;
	
	// 2. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 전달받아 멤버변수에 대입하는 생성자
	public ProductService() {}
	
	// 2. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 전달받아 멤버변수에 대입하는 Setter메서드
	public ProductService(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void 상품입고처리() {
		productDao.insertProduct();
	}
	
	public void 상품출고처리() {
		productDao.updateProduct();
	}
}
