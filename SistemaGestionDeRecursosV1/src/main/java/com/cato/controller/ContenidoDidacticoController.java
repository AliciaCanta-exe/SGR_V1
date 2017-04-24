package com.cato.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cato.entities.Cursos;
import com.cato.services.MallasService;

@RestController
public class ContenidoDidacticoController {

	@Autowired
	MallasService mallasServices;

	static final Logger logger = Logger.getLogger(UsuariosController.class);

	
	@RequestMapping(value = "/listCursos/", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> listCursosMalla(String anio, String codigo) {

		Map<String, Object> map = new HashMap<String, Object>();

		List<Cursos> list = mallasServices.listCursosMalla(anio, codigo);

		if (list != null) {
			map.put("status", "200");
			map.put("message", "Data found");
			map.put("data", list);
		} else {
			map.put("status", "404");
			map.put("message", "Data not found");
		}
		return map;
	}

}
