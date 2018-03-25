package com.namson.onlinebackend.dao;

import java.util.List;

import com.namson.onlinebackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);

}
