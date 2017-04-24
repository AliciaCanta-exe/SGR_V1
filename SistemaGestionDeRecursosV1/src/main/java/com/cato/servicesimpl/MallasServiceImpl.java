package com.cato.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cato.dao.MallasDao;
import com.cato.entities.Cursos;
import com.cato.entities.CursosXMalla;
import com.cato.entities.Mallas;
import com.cato.services.MallasService;

@Service
public class MallasServiceImpl implements MallasService{

	@Autowired
    MallasDao mallasDao;
	
	@Override
	public Mallas findByAnio(String anio) {	
		return mallasDao.findByAnio(anio);
	}

	@Override
	public Mallas findByCod(String codigo) {
		return mallasDao.findByCod(codigo);
	}

	@Override
	public List<Mallas> list() {
		return mallasDao.list();
	}

	@Override
	public List<Cursos> listCursosMalla(String anio, String codigo) {
		return mallasDao.listCursosMalla(anio, codigo);
	}
	
}
