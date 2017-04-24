package com.cato.services;

import java.util.List;

import com.cato.entities.Cursos;
import com.cato.entities.Mallas;

public interface MallasService {
	
	Mallas findByAnio(String anio);
	
	Mallas findByCod(String codigo);
	
    public List<Mallas> list();	
    
    public List<Cursos> listCursosMalla(String anio, String codigo);

}
