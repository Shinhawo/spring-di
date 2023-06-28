package com.sample1;

/*
 * 의존성 주입받기
 * 
 */
public class UserService {
	
	// 1. 의존하는 객체를 참조하는 멤버변수를 정의한다. 생성하지 않음!!!!!!!!!!!!!!!!
	private OracleUserDao oracleUserDao;
	
	public UserService() {}
	
	// 2. 의존하는 객체를 전달받아서 멤버변수에 대입하는 생성자 메서드를 정의한다.
	public UserService(OracleUserDao oracleUserDao) {
		this.oracleUserDao = oracleUserDao;
	}
	
	// 2. 의존하는 객체를 전달받아서 멤버변수에 대입하는 Setter 메서드를 정의한다.
	public void setOracleUserDao(OracleUserDao oracleUserDao) {
		this.oracleUserDao = oracleUserDao;
	}
	
	
	
	public void 회원가입(String id, String pwd, String name) {
		oracleUserDao.insertUser();
	}
	
	public void 회원탈퇴(String id) {
		oracleUserDao.deleteUser();
	}
}
