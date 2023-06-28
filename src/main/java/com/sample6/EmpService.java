package com.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpService.class);
	
	private EmpDao empDao;
	private DeptDao deptDao;
	private LocationDao locationDao;
	
	@Autowired
	// 반드시 해당 타입의 객체가 한개만 !!! 있어야함. 0개, 2개 이상(인터페이스)이다? 바로 오류
	public void setEmpDao(EmpDao empDao) {
		logger.debug("setEmpDao(empDao) 실행됨 - {}", empDao);
		this.empDao = empDao;
	}
	
	@Autowired
	public void setDeptDao(DeptDao deptDao) {
		logger.debug("setDeptDao(deptDao) 실행됨 - {}", deptDao);
		this.deptDao = deptDao;
	}
	
	@Autowired
	public void setLocationDao(LocationDao locationDao) {
		logger.debug("setLocationDao(locationDao) 실행됨 - {}", locationDao);
		this.locationDao = locationDao;
	}
	
	public void test() {
		
	}
}


