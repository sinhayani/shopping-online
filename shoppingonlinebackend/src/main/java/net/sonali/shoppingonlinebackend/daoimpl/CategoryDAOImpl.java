package net.sonali.shoppingonlinebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sonali.shoppingonlinebackend.dao.CategoryDAO;
import net.sonali.shoppingonlinebackend.dto.Category;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category>  categories = new ArrayList<>();
	
	static
	{
		Category category =  new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Test");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category =  new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Test1");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category =  new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Test2");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category : categories)
		{
			if(category.getId() == id)
				return category;
		}
		
		return null;
	}

}
