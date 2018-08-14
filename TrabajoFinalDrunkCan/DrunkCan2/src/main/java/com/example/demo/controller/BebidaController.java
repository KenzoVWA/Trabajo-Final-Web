package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Bebida;
import com.example.demo.service.IBebidaService;

@Controller
@RequestMapping("/")
public class BebidaController {
	@Autowired
	private IBebidaService bebidaService;

	@GetMapping("/bebidas")
	public String findAll(Model model) {

		model.addAttribute("bebidas", bebidaService.findAll());
		model.addAttribute("bebida", new Bebida());
		return "listabebidas";

	}

	@PostMapping("/bebidas")
	public String save(@Valid Bebida bebida, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/bebidas";
		}
		bebidaService.save(bebida);
		return "redirect:/bebidas";
	}

}
