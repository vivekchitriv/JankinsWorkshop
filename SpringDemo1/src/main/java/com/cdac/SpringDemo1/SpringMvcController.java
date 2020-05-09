package com.cdac.SpringDemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMvcController {

	
	@RequestMapping("/")
	public String viewHome() {
		return "index.html";
	}
}
