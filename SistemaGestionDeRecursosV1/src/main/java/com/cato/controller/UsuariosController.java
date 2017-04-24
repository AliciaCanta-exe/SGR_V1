package com.cato.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.cato.entities.Usuarios;
import com.cato.services.UsuariosService;

@RestController
public class UsuariosController {

	@Autowired
	UsuariosService usuariosServices;

	static final Logger logger = Logger.getLogger(UsuariosController.class);

	@RequestMapping(value = "/autentication/", method = RequestMethod.POST)
	public Usuarios autentication(@RequestBody Usuarios usuarios, UriComponentsBuilder ucBuilder) {

		Usuarios user = new Usuarios();

		try {
			if (usuariosServices.autentication(usuarios) != null) {
				user = usuariosServices.autentication(usuarios);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	// @RequestMapping(value = "/page", method = RequestMethod.GET)
	// public ModelAndView getPage() {
	// ModelAndView view = new ModelAndView("usuarios");
	// return view;
	// }
	//
	// @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	// public @ResponseBody Map<String, Object> getSaved(Usuarios usuarios) {
	//
	// Map<String, Object> map = new HashMap<String, Object>();
	//
	// if (usuariosServices.saveOrUpdate(usuarios)) {
	// map.put("status", "200");
	// map.put("message", "Your record have been saved successfully");
	// }
	//
	// return map;
	// }
	//
	// @RequestMapping(value = "/list", method = RequestMethod.POST)
	// public @ResponseBody Map<String, Object> getAll(Usuarios usuarios) {
	// Map<String, Object> map = new HashMap<String, Object>();
	//
	// List<Usuarios> list = usuariosServices.list();
	//
	// if (list != null) {
	// map.put("status", "200");
	// map.put("message", "Data found");
	// map.put("data", list);
	// } else {
	// map.put("status", "404");
	// map.put("message", "Data not found");
	//
	// }
	//
	// return map;
	// }
	//
	// @RequestMapping(value = "/delete", method = RequestMethod.POST)
	// public @ResponseBody Map<String, Object> delete(Usuarios usuarios) {
	// Map<String, Object> map = new HashMap<String, Object>();
	//
	// if (usuariosServices.delete(usuarios)) {
	// map.put("status", "200");
	// map.put("message", "Your record have been deleted successfully");
	// }
	//
	// return map;
	// }

	// -------------------Create a
	// User--------------------------------------------------------

	// @RequestMapping(value = "/user/", method = RequestMethod.POST)
	// public ResponseEntity<Void> createUser(@RequestBody User user,
	// UriComponentsBuilder ucBuilder) {
	// System.out.println("Creating User " + user.getUsername());
	//
	// if (userService.isUserExist(user)) {
	// System.out.println("A User with name " + user.getUsername() + " already
	// exist");
	// return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	// }
	//
	// userService.saveUser(user);
	//
	// HttpHeaders headers = new HttpHeaders();
	// headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
	// return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	// }

}
