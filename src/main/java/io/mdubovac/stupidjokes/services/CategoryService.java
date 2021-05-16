package io.mdubovac.stupidjokes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mdubovac.stupidjokes.models.Category;
import io.mdubovac.stupidjokes.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}

	public Category getCategory(long id) {
		Category category = categoryRepository.findById(id).get();
		return category;
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

	public void deleteCategory(long id) {
		categoryRepository.deleteById(id);
	}
	
}
