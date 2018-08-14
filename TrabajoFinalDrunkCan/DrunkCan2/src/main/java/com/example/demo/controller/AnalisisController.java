package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.AnalisisSalida;
import com.example.demo.service.IAnalisisSalidaService;

@Controller
@RequestMapping("/")
public class AnalisisController {

	@Autowired
	private IAnalisisSalidaService analisisService;

	@GetMapping("/analisis")
	public String findAll(Model model) {
		model.addAttribute("analisises", analisisService.findAll());
		return "listado-analisis";

	}

	@PostMapping("/analisis")
	public String save(@Valid AnalisisSalida analisis, BindingResult result) {
		int porcentaje = (int) (analisis.getBebida().getPorcentajealcohol() * analisis.getCantidadbebidas());
		int total = (int) (analisis.getBebida().getPrecio() * analisis.getCantidadbebidas());
		
		analisis.setPorcentajetotal(porcentaje);
		analisis.setTotal(total);
		
		
		if (result.hasErrors()) {
			return "redirect:/analisis";
		}
		analisisService.save(analisis);
		return "redirect:/analisis";
	}

	
}
