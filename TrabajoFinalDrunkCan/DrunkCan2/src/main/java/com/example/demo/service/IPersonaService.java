package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Persona;

public interface IPersonaService {
	public List<Persona> findAll();
	public Persona save(Persona p);
}
