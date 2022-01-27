package ar.com.educacionit.services;

public interface GenericService<T> {
	

		public T getOne(Long id);
		
		public void delete(Long id);
		
		public T save(T entity);
		
		public void update(T entity);
		
		public T[] findAll();
	}


