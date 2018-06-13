package com.blog.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String blog() {
		System.out.println("index Controller");
		return "index";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product() {
		System.out.println("product Controller");
		return "product";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post() {
		System.out.println("post Controller");
		return "post";
	}
	
	@RequestMapping(value = "/blogAndSide", method = RequestMethod.GET)
	public String blogAndSide() {
		System.out.println("blogAndSide Controller");
		return "blogAndSide";
	}
	
}
