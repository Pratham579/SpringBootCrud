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
import com.nimap.Interview.repository.CategoryRepository;
import com.nimap.Interview.services.CategoryService;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

	@Autowired
	private CategoryService categoryserv;
	
	@GetMapping
	public List<Category> allCategory(){
	
		return categoryserv.allCategory();
	}
	
	//@RequestMapping(method = RequestMethod.POST, value="/categorys")
	@PostMapping
	public Category addCategory(@RequestBody Category category) {
		
		return categoryserv.addCategory(category);
	}
	
	//@RequestMapping(method = RequestMethod.PUT, value="/categorys/{categoryId}")
	@PutMapping("/{categoryId}")
	public Category updateCategory(@PathVariable Integer categoryId, @RequestBody Category category) {
		return categoryserv.updateCategory(categoryId,category);
	}
	
	@DeleteMapping("/{categoryId}")
	public boolean deleteCategory(@PathVariable Integer categoryId) {
		return categoryserv.deleteCategory(categoryId);
	}
}
