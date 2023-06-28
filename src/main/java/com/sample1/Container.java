package com.sample1;

public class Container {

	public static void main(String[] args) {
		// 1. 애플리케이션 실행에 필요한 객체를 생성한다.
		OracleUserDao oracleUserDao = new OracleUserDao();
		UserService userService = new UserService();
		
		// 2. 객체들 간의 의존관계를 분석해서 의존성을 주입한다. (조립) 안하면 oracleUserDao가 null이되어 오류남
		userService.setOracleUserDao(oracleUserDao);
		
		// 3. 생성된 객체 사용하기
		userService.회원가입("hong", "zxcv1234", "홍길동");
	}
}
