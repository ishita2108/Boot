package com.productapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.productapp.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@GetMapping(path="products")
	public String getAllProducts(ModelMap modelMap) {
		modelMap.addAttribute("allproducts", productService.findAll());
		return "products";
	}
	

}
