package io.mdubovac.stupidjokes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.mdubovac.stupidjokes.models.Category;
import io.mdubovac.stupidjokes.services.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@RequestMapping("/categories/{id}")
	public Category getCategory(@PathVariable long id) {
		return categoryService.getCategory(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/categories")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/categories/{id}")
	public void updateCategory(@RequestBody Category category, @PathVariable long id) {
		categoryService.updateCategory(category);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/categories/{id}")
	public void deleteCategory(@PathVariable long id) {
		categoryService.deleteCategory(id);
	}
}
