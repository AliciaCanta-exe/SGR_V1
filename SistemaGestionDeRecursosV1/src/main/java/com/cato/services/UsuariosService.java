package com.cato.services;

import java.util.List;

import com.cato.entities.Usuarios;

public interface UsuariosService {
	
    public boolean saveOrUpdate(Usuarios usuarios);
    
    public List<Usuarios> list();
 
    public boolean delete(Usuarios usuarios);
    
    public Usuarios autentication(Usuarios usuarios);
    
}
