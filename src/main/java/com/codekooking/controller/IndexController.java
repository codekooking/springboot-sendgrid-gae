package com.codekooking.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.appengine.repackaged.org.json.JSONException;

import com.codekooking.Sendgrid;

@RestController

public class IndexController {
	
	@Value("${sendgrid.username}")
	String username;
	
	@Value("${sendgrid.password}")
	String password;
	
	@Value("${sendgrid.from}")
	String from;

    @GetMapping("/send-mail")
    @ResponseBody
    public String sendMail(@RequestParam("email") String email) throws JSONException {
    	// set credentials
    	Sendgrid mail = new Sendgrid(this.username, this.password);

    	// set email data
    	mail.setTo(email).setFrom(this.from).setSubject("Test send mail with Sendgrid").setText("Hello World!").setHtml("<strong>Hello World!</strong>");

    	// send your message
    	mail.send();
    	
		return email;
    }

}
