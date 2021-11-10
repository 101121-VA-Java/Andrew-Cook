package com.revature.repositories;
import java.util.List;
public interface GenericDao<T> {
	
		T add(T t);			// object that hasn't been defined
	T getByID(int id);		// 
		List<T> getAll();
	boolean update(T t);
	T remove(T t);
	
}
