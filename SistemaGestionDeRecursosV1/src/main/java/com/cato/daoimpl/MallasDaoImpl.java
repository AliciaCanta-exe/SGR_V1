package com.cato.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cato.dao.MallasDao;
import com.cato.entities.Cursos;
import com.cato.entities.Mallas;

@Repository
@Transactional
public class MallasDaoImpl implements MallasDao {

	@Autowired
	SessionFactory session;
	
	@Override
	public Mallas findByAnio(String anio) {
		
		Mallas m = new Mallas();

		try {
			m = (Mallas) session.getCurrentSession()
								.createQuery("from Mallas where anio=?")
								.setParameter(0, anio);

		} catch (Exception e) {
			System.err.println(" Error: "+e.getMessage());
			  e.printStackTrace() ;
		}
		return m;
	}

	@Override
	public Mallas findByCod(String codigo) {
		
		Mallas m = new Mallas();

		try {
			m = (Mallas) session.getCurrentSession()
							    .createQuery("from Mallas where codigo=?")
							    .setParameter(0, codigo);

		} catch (Exception e) {
			System.err.println(" Error: "+e.getMessage());
			  e.printStackTrace() ;
		}
		return m;
	}

	@Override
	public List<Mallas> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Integer> listCursosDeMalla(String anio, String codigo) {
		
		Mallas m = new Mallas();
		
		if(anio   != null)	{m=findByAnio(anio);} 
		if(codigo != null)	{m=findByCod(codigo);}
		
		List<Integer> idsCursos = new ArrayList<Integer>();

		try {
			idsCursos = session.getCurrentSession()
							   .createQuery("cursoId from CursosXMalla where mallaId=?")
							   .setParameter(0, m.getMallaId())
							   .list();

		} catch (Exception e) {
			System.err.println(" Error: "+e.getMessage());
			  e.printStackTrace() ;
		}
		
		return idsCursos;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cursos> listCursosMalla(String anio, String codigomalla) {
		
		List<Integer> listIdsCursos = listCursosDeMalla(anio, codigomalla);
		
		List<Cursos> c = new ArrayList<Cursos>();
		try {
			c =  session.getCurrentSession()
						.createQuery("from Cursos where cursoId in:cursoId")
						.setParameter("cursoId", "("+listIdsCursos+")")
						.list();

		} catch (Exception e) {
			System.err.println(" Error: "+e.getMessage());
			  e.printStackTrace() ;
		}
		return c;
	}	
}
