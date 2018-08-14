package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bebida;
import com.example.demo.repository.BebidaRepository;

@Service
public class BebidaService implements IBebidaService {

	@Autowired
	private BebidaRepository bebidaRep;
	
	@Override
	public List<Bebida> findAll() {
		// TODO Auto-generated method stub
		return bebidaRep.findAll();
	}

	@Override
	public Bebida save(Bebida b) {
		// TODO Auto-generated method stub
		return bebidaRep.save(b);
	}

}
