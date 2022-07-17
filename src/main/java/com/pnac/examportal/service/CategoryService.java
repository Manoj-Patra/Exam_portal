package com.pnac.examportal.service;

import java.util.Set;

import com.pnac.examportal.DTO.CategoryDTO;
import com.pnac.examportal.entity.exam.Category;

public interface CategoryService {

	public Category addCategory(CategoryDTO categoryDTO);
	
	public Category updateCategory(CategoryDTO categoryDTO);
	
	public Set<Category> getCategories();
	
	public Category getCategory(Long id);
	
	public void deleteCategory(Long id);
	
}
