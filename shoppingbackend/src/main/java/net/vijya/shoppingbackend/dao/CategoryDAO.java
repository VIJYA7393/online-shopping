package net.vijya.shoppingbackend.dao;

import java.util.List;

import net.vijya.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
	
	
}
