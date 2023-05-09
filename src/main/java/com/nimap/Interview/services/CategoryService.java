package com.nimap.Interview.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.Interview.model.Category;
import com.nimap.Interview.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryrepo;

	public List<Category> allCategory(){
		
		return categoryrepo.findAll();
		
	}

	public Category addCategory(Category category) {
		
		return categoryrepo.save(category);
	}

	public Category updateCategory(Integer categoryId, Category category) {

		return categoryrepo.save(category);
	}

	public boolean deleteCategory(Integer categoryId) {

		categoryrepo.deleteById(categoryId);
		return true;
	}
}
