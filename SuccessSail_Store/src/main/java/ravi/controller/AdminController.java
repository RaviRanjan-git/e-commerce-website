package ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("/")
	public String index() {
		return "admin/index";
	}
	@GetMapping("/loadAddProduct")
	public String loadAddProduct() {
		return "admin/add_product";
	}
	@GetMapping("/categoryes")
	public String category() {
		return "admin/category";
		
	}
	@PostMapping("/saveCategoryes")
	public String saveCategory() {
		return "redirect:/category";
}
}