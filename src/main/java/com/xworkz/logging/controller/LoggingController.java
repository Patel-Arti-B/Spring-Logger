package com.xworkz.logging.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggingController {

	private static Logger logger = Logger.getLogger(LoggingController.class);

	public LoggingController() {
		logger.info("obj created. \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/msg.do")
	public String getMessage(ModelMap model) {
		logger.info("invoked get message...");
		logger.error("Logger controller error message..!!!");

		model.addAttribute("msg", "Hello Everyone...");

		return "Welcome.jsp";
	}
}
