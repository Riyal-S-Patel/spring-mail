package com.xworkz.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mail.service.MailService;

@Controller
public class MailController {

	private static final Logger logger = Logger.getLogger(MailController.class);

	@Autowired
	private MailService mailService;

	public MailController() {
		logger.info(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping("/sendMail.do")
	public String sendMail(String toMailid, String subject, String body, Model model) {
		logger.info("inside sendMail from controller");
		logger.info("Mail id :" + toMailid);
		logger.info("Subject :" + subject);
		logger.info("body :" + body);
		this.mailService.sendMailByEmailId(toMailid, subject, body);
		model.addAttribute("messsage", toMailid);
		return "success.jsp";

	}
}
