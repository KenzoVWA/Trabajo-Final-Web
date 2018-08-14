package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AnalisisSalida;

public interface IAnalisisSalidaService {
	public List<AnalisisSalida> findAll();
	public AnalisisSalida save(AnalisisSalida analisis);
}
