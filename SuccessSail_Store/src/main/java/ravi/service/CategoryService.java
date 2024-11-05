package ravi.service;

import java.util.List;

import ravi.model.Category;

public interface CategoryService {
	public Category saveCategory(Category category);
	public List<Category> getAllCategory();
}
