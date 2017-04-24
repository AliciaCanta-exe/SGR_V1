package com.cato.dao;

import java.util.List;

import com.cato.entities.Cursos;
import com.cato.entities.Mallas;

public interface MallasDao {

	Mallas findByAnio(String anio);
	
	Mallas findByCod(String codigo);
	
    public List<Mallas> list();	
    
    public List<Cursos> listCursosMalla(String anio, String codigo);
}
