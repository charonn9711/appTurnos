package com.example.semilla.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semilla.springboot.entity.ComercioEntity;
import com.example.semilla.springboot.repository.IComercioRepository;

@Service

public class ComercioService implements IComercioService {
	
	@Autowired
	private IComercioRepository comercioRepository;

	@Override
	public List<ComercioEntity> getAll() {
		
	return comercioRepository.findAll();
	}

	@Override
	public ComercioEntity getComercioById(Integer id_comercio) {
	
		return null;
	}

	@Override
	public ComercioEntity createComercio(ComercioEntity comercioEntity) {
	
		return null;
	}

	@Override
	public ComercioEntity updateComercio(ComercioEntity comercioEntity) {
	
		return null;
	}

	@Override
	public void deleteComercio(Integer id_comercio) {
	
		
	}

}
