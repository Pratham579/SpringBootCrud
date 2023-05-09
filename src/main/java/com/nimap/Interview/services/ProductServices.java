package com.nimap.Interview.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.Interview.model.Product;
import com.nimap.Interview.repository.ProductRepository;
@Service
public class ProductServices {
	@Autowired
	private ProductRepository productrepo;

	public List<Product> allProduct(){
		return productrepo.findAll();
	}

	public Product addProduct(Product product) {
		
		return productrepo.save(product);
	}

	public Product updateProduct(Integer productId, Product product) {

		return productrepo.save(product);
	}

	public boolean deleteProduct(Integer productId) {

		productrepo.deleteById(productId);
		return true;
	}
}
