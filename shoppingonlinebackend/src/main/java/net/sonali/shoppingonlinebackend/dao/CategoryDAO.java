package net.sonali.shoppingonlinebackend.dao;

import java.util.List;

import net.sonali.shoppingonlinebackend.dto.Category;

public interface CategoryDAO {
	
	public List<Category> list();

	public Category get(int id);
	

}
