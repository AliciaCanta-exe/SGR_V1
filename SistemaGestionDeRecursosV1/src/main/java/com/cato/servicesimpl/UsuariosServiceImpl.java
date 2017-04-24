package com.cato.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cato.dao.UsuariosDao;
import com.cato.entities.Usuarios;
import com.cato.services.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
    UsuariosDao usuariosDao;

	@Override
	public boolean saveOrUpdate(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuariosDao.saveOrUpdate(usuarios);
	}

	@Override
	public List<Usuarios> list() {
		// TODO Auto-generated method stub
		return usuariosDao.list();
	}

	@Override
	public boolean delete(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuariosDao.delete(usuarios);
	}

	@Override
	public Usuarios autentication(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuariosDao.autentication(usuarios);
	}
	
}
