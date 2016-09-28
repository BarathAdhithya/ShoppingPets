/*package com.niit.shoppingkart.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkart.model.Category;

public class CategoryTestCase {
	@Autowired
	AnnotationConfigApplicationContext context;
	@Autowired
CategoryDAO categoryDAO;
	@Autowired
	Category category;

	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingkart");
		context.refresh();
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	@Test
	public void createCategoryTestCase()
	{
		category.setId("LAP_l01");
		category.setName("Dell");
		category.setDescription("Dell Laptop");
		
		Assert.assertEquals("hello", true, categoryDAO.update(category));
		
		//Assert.assertEquals("Create Category", true,categoryDAO.saveorupdate(category));
		
	}
	@Test
	public void listCategoryTestCase()
	{
	Assert.assertEquals("List Category", 3,categoryDAO.list().size());
}
}


*/