package com.cato.services;

import java.util.List;

import com.cato.entities.Cursos;

public interface CursosService {
	
	Cursos findById(Integer id);
	
	Cursos findByName(String nombre);
	
    public List<Cursos> list();

}
