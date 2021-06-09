package me.fevvelasquez.spring.mvc.th.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
	public String index(Model model) {
		// Model only for this handler.
		model.addAttribute("count", Arrays.asList(101, 102, 103));

		return "index"; // "index.html" located in "src/main/resources/templates"
	}

	/**
	 *  This model is common to all handlers.
	 */
	@ModelAttribute("letters")
	private List<String> setLetterList() {
		return Arrays.asList("A", "B", "C");
	}
}