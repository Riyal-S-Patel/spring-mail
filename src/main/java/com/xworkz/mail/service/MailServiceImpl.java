package com.xworkz.mail.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	private static final Logger logger = Logger.getLogger(MailServiceImpl.class);
	@Autowired
	private MailSender mailSender;

	public MailServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " object is created..!!!!");
	}

	public boolean sendMailByEmailId(String to, String Subj, String body) {
		logger.info("inside sendMailByEmailId() of MailServiceImpl...!!!!");
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(Subj);
		mail.setText(body);

		try {
			mailSender.send(mail);
			logger.info("mail sent successfully");
			return true;
		} catch (MailException e) {
			logger.error(e.getMessage(), e);
		}
		return false;
	}

}
