package com.niit.shoppingkart.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.model.Category;

@Repository("CategoryDAO")
public class CategoryImpl implements CategoryDAO {
@Autowired
private Category category;
@Autowired
private SessionFactory sessionFactory;
public CategoryImpl(SessionFactory sessionFactory){
	this.sessionFactory=sessionFactory;
}

public boolean save(Category category){
	try
	{
		sessionFactory.getCurrentSession().save(category);
	}catch(Exception e)
	{
		e.printStackTrace();
	    return false;
}
	return true;
}
public boolean update(Category category){
	try
	{
		sessionFactory.getCurrentSession().update(category);
	}catch(Exception e)
	{
		e.printStackTrace();
	    return false;
}
	return true;
}
public boolean delete(String id){
	try
	{
		sessionFactory.getCurrentSession().delete(category);
	}catch(Exception e)
	{
		e.printStackTrace();
	    return false;
}
	return true;
}
public Category get(String id){
String hql = "from Category where id = " + id +"";
Query query = sessionFactory.getCurrentSession().createQuery(hql);
List<Category> list = query.list();
	return null;
}
	public List<Category> list() {
		return null;
	}
}

