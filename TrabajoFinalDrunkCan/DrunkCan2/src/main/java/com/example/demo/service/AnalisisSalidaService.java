package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AnalisisSalida;
import com.example.demo.repository.AnalisisSalidaRepository;

@Service
public class AnalisisSalidaService implements IAnalisisSalidaService {

	@Autowired
	private AnalisisSalidaRepository AnalisisSalidaRep;
	
	@Override
	public List<AnalisisSalida> findAll() {
		// TODO Auto-generated method stub
		return AnalisisSalidaRep.findAll();
	}

	@Override
	public AnalisisSalida save(AnalisisSalida analisis) {
//		System.out.println("BEBIDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + analisis.getBebida().getNombre());
//		int porcentaje = (int) (analisis.getBebida().getPorcentajealcohol() * analisis.getCantidadbebidas());
//		int total = (int) (analisis.getBebida().getPrecio() * analisis.getCantidadbebidas());
//		
//		analisis.setPorcentajetotal(porcentaje);
//		analisis.setTotal(total);
//		
		// TODO Auto-generated method stub
		return AnalisisSalidaRep.save(analisis);
	}

}
