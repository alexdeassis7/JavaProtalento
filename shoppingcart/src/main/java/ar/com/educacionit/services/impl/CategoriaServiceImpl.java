package ar.com.educacionit.services.impl;


import ar.com.educacionit.dao.impl.CategoriaDaoImpl;
import ar.com.educacionit.dominio.Categoria;
import ar.com.educacionit.services.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService<Categoria> implements CategoriaService {

	

	

	
		
		public CategoriaServiceImpl() {
			super(new CategoriaDaoImpl());
		}
	
	
	}

	


