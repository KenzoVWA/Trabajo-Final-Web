package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Establecimiento;
import com.example.demo.service.IEstablecimeintoService;

@Controller
@RequestMapping("/")
public class EstablecimientoController {
	@Autowired
	private IEstablecimeintoService establecimientoService;

	@GetMapping("/establecimientos")
	public String findAll(Model model) {

		model.addAttribute("establecimientos", establecimientoService.findAll());
		model.addAttribute("establi", new Establecimiento());
		return "listaestablecimientos";

	}

	@PostMapping("/registraestab")
	public String save(@Valid Establecimiento establecimiento, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/personas";
		}
		establecimientoService.save(establecimiento);
		return "redirect:/personas";
	}

}
