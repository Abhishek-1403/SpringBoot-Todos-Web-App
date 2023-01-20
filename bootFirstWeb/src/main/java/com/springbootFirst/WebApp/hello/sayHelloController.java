package com.springbootFirst.WebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

@Controller
public class sayHelloController {
	
	// "say-hello" => "Hello! what are you learning today?"
	
	// say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello() {
		return "Hello! what are you learning today?";
	}
	
	
	@RequestMapping("say-hello-jsp")
	public String SayHellojsp() {
		return "sayHello";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String SayHelloHtml() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My page</title>");
		sb.append("</head>");
		sb.append("body");
		sb.append("my page");
		sb.append("/body");
		sb.append("</html>");
		return sb.toString();
	}
	
}
