package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bebida;

public interface IBebidaService {
	public List<Bebida> findAll();
	public Bebida save(Bebida b);
}
