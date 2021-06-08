package com.example.semilla.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.semilla.springboot.entity.ComercioEntity;

public interface IComercioRepository  extends JpaRepository<ComercioEntity, Integer>{
	
	

}
