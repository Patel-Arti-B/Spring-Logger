package com.xworkz.logging.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggingController {

	private static Logger logger = Logger.getLogger(LoggingController.class);

	public LoggingController() {
		System.out.println("SOUT::  obj created. \t" + this.getClass().getSimpleName());
		logger.warn("obj created. \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/msg.do")
	public String getMessage(ModelMap model) {
		logger.info("inside getMessage() of controller.....");
		System.out.println("SOUT::  inside getMessage() of controller.....");
		logger.error("Logger controller error message..!!!");

		model.addAttribute("msg", "Hello Everyone...");

		return "Welcome.jsp";
	}
}
