package com.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileService {
	
	private static Logger logger = LoggerFactory.getLogger(FileService.class);
	
	// 여기에 값이 주입되고 있다 (setter 메서드로)
	private String directory;
	private long maxUploadSize;
	private int maxUploadFileCount;
	
	public FileService() {}
	
	public FileService(String directory, long maxUploadSize, int maxUploadCount) {
		this.directory = directory;
		this.maxUploadSize = maxUploadSize;
		this.maxUploadFileCount = maxUploadCount;
	}
	
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	public void setMaxUploadFileCount(int maxUploadFileCount) {
		this.maxUploadFileCount = maxUploadFileCount;
	}
	
	public void setMaxUploadSize(long maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
	}

	public void upload(String filename) {
		logger.info("파일 업로드 메서드 실행됨");
		
		logger.info("파일이름 : {}",filename);
		logger.info("디렉토리 경로 : {}",directory);
		logger.info("최대 업로드 사이즈 : {}",maxUploadSize);
		logger.info("최대 업로드 파일 갯수 : {}",maxUploadFileCount);
		
		logger.debug("파일 업로드 메서드 종료됨");
	}
	
	public void download(String filename) {
		
	}
}
