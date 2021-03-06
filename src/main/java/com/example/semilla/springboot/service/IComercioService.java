package com.example.semilla.springboot.service;

import java.util.List;

import com.example.semilla.springboot.entity.ComercioEntity;

public interface IComercioService {
	
	public List<ComercioEntity> getAll();
	
	public ComercioEntity getComercioById(Integer id_comercio);
	
	public ComercioEntity createComercio(ComercioEntity comercioEntity);
	
	public ComercioEntity updateComercio(ComercioEntity comercioEntity);
	
	public void deleteComercio(Integer id_comercio);

}
