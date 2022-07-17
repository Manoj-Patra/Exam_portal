package com.pnac.examportal.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnac.examportal.DTO.CategoryDTO;
import com.pnac.examportal.entity.exam.Category;
import com.pnac.examportal.repositary.CategoryRepositary;
import com.pnac.examportal.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepositary categoryRepositary;
	
	@Override
	public Category addCategory(CategoryDTO categoryDTO) {
		Category category = categoryDTO_to_Category(categoryDTO);
		return this.categoryRepositary.save(category);
	}

	@Override
	public Category updateCategory(CategoryDTO categoryDTO) {
		Category category = categoryDTO_to_Category(categoryDTO);
		return this.categoryRepositary.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		return new LinkedHashSet<>(this.categoryRepositary.findAll());
	}

	@Override
	public Category getCategory(Long id) {
		return this.categoryRepositary.findById(id).get();
	}

	@Override
	public void deleteCategory(Long id) {
		this.categoryRepositary.deleteById(id);
	}

	public Category categoryDTO_to_Category(CategoryDTO categoryDTO) {
		Category category = new Category();
		category.setDescription(categoryDTO.getDescription());
		category.setTitle(categoryDTO.getTitle());
		
		return category;
	}
	
}
