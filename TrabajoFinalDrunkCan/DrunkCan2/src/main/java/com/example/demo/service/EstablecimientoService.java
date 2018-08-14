package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Establecimiento;
import com.example.demo.repository.EstablecimientoRepository;

@Service
public class EstablecimientoService implements IEstablecimeintoService {

	@Autowired
	private EstablecimientoRepository establecimientoRep;
	
	@Override
	public List<Establecimiento> findAll() {
		// TODO Auto-generated method stub
		return establecimientoRep.findAll();
	}

	@Override
	public Establecimiento save(Establecimiento e) {
		// TODO Auto-generated method stub
		return establecimientoRep.save(e);
	}

}
