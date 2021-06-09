package me.fevvelasquez.spring.mvc.th.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring MVC Thymeleaf Demo
 * 
 * 
 * @author fevvelasquez
 *
 */
@Controller
public class IndexController {

	@GetMapping({ "/", "/index" })
	public String index() {
		return "index"; // "index.html" located in "src/main/resources/templates"
	}
}
