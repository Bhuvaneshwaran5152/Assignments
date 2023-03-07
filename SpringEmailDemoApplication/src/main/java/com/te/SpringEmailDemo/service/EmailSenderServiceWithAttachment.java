package com.te.SpringEmailDemo.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderServiceWithAttachment {

	@Autowired
	private JavaMailSender mailSender;

	public void emailWithAttachment(String toEmail, String subject, String body, String attachment)
			throws MessagingException {
		MimeMessage createMimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(createMimeMessage, true);
		helper.setFrom("bhuvane34@gmail.com");
		helper.setTo(toEmail);
		helper.setText(body);
		helper.setSubject(subject);
		FileSystemResource resource = new FileSystemResource(new File(attachment));

		helper.addAttachment(resource.getFilename(), resource);
		mailSender.send(createMimeMessage);
		System.out.println("sent");

	}

}
