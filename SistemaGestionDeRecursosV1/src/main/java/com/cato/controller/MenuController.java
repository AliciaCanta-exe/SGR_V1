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
public class MenuController {
	
    @Autowired
    UsuariosService usuariosServices;

    static final Logger logger = Logger.getLogger(MenuController.class);	
    
    
    @RequestMapping(value = "/menu/", method = RequestMethod.POST)
    public ModelAndView  delegate(@RequestBody Usuarios usuarios, UriComponentsBuilder ucBuilder) {    	
    	
    	logger.debug("MenuController : Autenticación del usuario "+usuarios.getEmail());
    	
    	ModelAndView model = new ModelAndView();


        model.setViewName("/index");
		return model;
    }  
  
}