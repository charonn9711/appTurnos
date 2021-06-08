package com.example.semilla.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semilla.springboot.entity.ComercioEntity;
import com.example.semilla.springboot.service.IComercioService;

@RestController
@RequestMapping(path = "/api/v1/comercio")

public class ComercioController {
	
	@Autowired	
	private IComercioService comercioService;
	
	@GetMapping(path = "/all")
	public List<ComercioEntity> getAll(){
		return comercioService.getAll();
	}

}
