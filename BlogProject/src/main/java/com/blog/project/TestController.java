package com.blog.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String blog() {
		System.out.println("blog Controller");
		return "blog";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product() {
		System.out.println("product Controller");
		return "product";
	}
	
}
