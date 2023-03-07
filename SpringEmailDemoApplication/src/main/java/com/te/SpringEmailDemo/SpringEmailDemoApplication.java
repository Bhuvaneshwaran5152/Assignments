package com.te.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.te.SpringEmailDemo.service.EmailSenderServiceWithAttachment;
import com.te.SpringEmailDemo.service.EmailSenderServiceWithoutAttachment;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private EmailSenderServiceWithoutAttachment senderService;

	@Autowired
	private EmailSenderServiceWithAttachment withAttachment;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() {
//		senderService.sendEmail("bhuvane34@gmail.com", "helloworld", "vanakumda mapla");
//    }
	@EventListener(ApplicationReadyEvent.class)
	public void sendMailwith() throws MessagingException {
		withAttachment.emailWithAttachment("bhuvane34@gmail.com", "helloworld", "vanakumda mapla",
				"A:\\SONGSS\\MELODY\\002.mp3");
	}
}
