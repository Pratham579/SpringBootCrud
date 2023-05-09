package com.nimap.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.Interview.model.Category;
import com.nimap.Interview.model.Product;
import com.nimap.Interview.repository.ProductRepository;
import com.nimap.Interview.services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productrepo;

	@GetMapping
	public List<Product> allProduct(){
		return productrepo.findAll();
	}

	@PostMapping
	public Product addProduct(Product product) {
		
		return productrepo.save(product);
	}

	@PutMapping
	public Product updateProduct(Integer productId, Product product) {

		return productrepo.save(product);
	}

	@DeleteMapping
	public boolean deleteProduct(Integer productId) {

		productrepo.deleteById(productId);
		return true;
	}


}
