package ar.com.educacionit.services.impl;


import ar.com.educacionit.dao.impl.SociosDaoimpl;
import ar.com.educacionit.dominio.Socios;
import ar.com.educacionit.services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {

	public SociosServiceImpl() {
		super(new SociosDaoimpl());
		
	}

	

	

}
