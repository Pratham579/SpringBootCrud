package com.nimap.Interview.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Category {
	@Id
	private Integer categoryId;
	
	private String categoryName;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL) 
	private List<Product> plist;
	
	public Category(Integer categoryId, String categoryName, List<Product> plist) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.plist = plist;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", plist=" + plist + "]";
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
}
