package com.sample5;

import java.util.List;

public class NotificationService {
	
	// 여러 종류의 MessageSender가 저장된다
	// MessagSender 인터페이스를 구현한 다양한 MessageSender 객체가 저장된 List 객체를 전달받는다.
	private List<MessageSender> messageSenders;
	
	public void setMessageSenders(List<MessageSender> messageSenders) {
		this.messageSenders = messageSenders;
	}
	
	public void noticeEvent(String[] customers, String from, String title, String content) {
		
		for (MessageSender sender : messageSenders) {
			
			for(String to : customers) {
				sender.send(from, to, title, content);
			}
		}
	}
}
