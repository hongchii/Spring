package com.spring.springif;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index1() {
		
		return "index";
	}
	
	@RequestMapping("/index")
	public String index2() {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/shop")
	public String shop() {
		
		return "shop";
	}
	
	@RequestMapping("/collection")
	public String collection() {
		
		return "collection";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		
		return "blog";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		
		return "contact";
	}
	
	@RequestMapping("/shopping-cart")
	public String shoppingcart() {
		
		return "shopping-cart";
	}
	
	@RequestMapping("/main")
	public String main() {
		
		return "main";
	}
	
	@RequestMapping("/blog-details")
	public String blogdetails() {
		
		return "blog-details";
	}
	
	@RequestMapping("/chek-out")
	public String chekout() {
		
		return "chek-out";
	}
	
	@RequestMapping("/faq")
	public String faq() {
		
		return "faq";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
}