package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private PersonaRepository personaRep;
	
	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaRep.findAll();
	}

	@Override
	public Persona save(Persona p) {
		// TODO Auto-generated method stub
		return personaRep.save(p);
	}

}
