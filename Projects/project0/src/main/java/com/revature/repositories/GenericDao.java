package com.revature.repositories;
import java.util.List;
public interface GenericDao<T> {
		T add(T t);			// Generic data type
	T getByID(int id);
		List<T> getAll();
	boolean update(T t);
	T remove(T t);
	
}
