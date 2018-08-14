package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Establecimiento;

public interface IEstablecimeintoService {
	public List<Establecimiento> findAll();
	public Establecimiento save(Establecimiento e);
}
