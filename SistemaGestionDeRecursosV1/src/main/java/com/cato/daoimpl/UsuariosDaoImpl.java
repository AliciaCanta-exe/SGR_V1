package com.cato.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.cato.dao.UsuariosDao;
import com.cato.entities.Usuarios;

@Repository
@Transactional
public class UsuariosDaoImpl implements UsuariosDao {

	@Autowired
	SessionFactory session;

	@Override
	public boolean saveOrUpdate(Usuarios usuarios) {
		session.getCurrentSession().saveOrUpdate(usuarios);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> list() {
		return session.getCurrentSession()
			   .createQuery("from usuarios").list();
	}

	@Override
	public boolean delete(Usuarios usuarios) {
		try {
			session.getCurrentSession().delete(usuarios);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public Usuarios autentication(Usuarios usuarios) {

		List<Usuarios> users = new ArrayList<Usuarios>();

		try {
			users = session.getCurrentSession()
					.createQuery("from Usuarios where email=? and clave=?")
					.setParameter(0, usuarios.getEmail().toString())
					.setParameter(1, usuarios.getClave().toString())
					.list();

		} catch (Exception e) {
			System.err.println(" Error: "+e.getMessage());
			  e.printStackTrace() ;
		}
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}
	
}
