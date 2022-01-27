package a.com.educacion.dao;


//AL trabajr sobre un t convertimos a gaeneric dao en un generico
public interface GaenericDao<T> {
	//primer metodo a utilizar me sirve como diferenciador poor su primary key
public T getOne(Long id);
	
	//segundo metodo  a utilizar el cual me sirve para eliminar información
	public void  delete(Long id);
	
	//tercer metodo
	
	public T save(T Socios);
	
	//cuarto metodo me sirve para actualizar informacion
	 public void update(T Socios);
	 
	 //quinto?
	 public T[] findAll();
}
