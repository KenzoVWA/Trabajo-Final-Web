package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.AnalisisSalida;
import com.example.demo.entity.Bebida;
import com.example.demo.entity.Establecimiento;
import com.example.demo.entity.Persona;
import com.example.demo.service.IBebidaService;
import com.example.demo.service.IEstablecimeintoService;
import com.example.demo.service.IPersonaService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private IEstablecimeintoService establecimientoService;
	@Autowired
	private IPersonaService personaService;
	@Autowired
	private IBebidaService bebidaService;
	
	@GetMapping
	public String index(){
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model){
		model.addAttribute("persona", new Persona());
		return "login";
	}
	
	@GetMapping("/establecimiento")
	public String establecimiento(Model model){
		model.addAttribute("establecimiento", new Establecimiento());
		return "registro-establecimiento";
	}
	
	@GetMapping("/listado")
	public String listado(){
		return "listado-analisis";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model){
		model.addAttribute("analisise", new AnalisisSalida());
		model.addAttribute("personas", personaService.findAll());
		model.addAttribute("bebidas", bebidaService.findAll());
		return "perfil";
	}
	
	@GetMapping("/newbebida")
	public String bebida(Model model){
		model.addAttribute("bebida", new Bebida());
		model.addAttribute("establecimientos", establecimientoService.findAll());
		return "registrobebida";
	}
//	
	@GetMapping("/listaestablecimientos")
	public String listaestablecimientos(){
		return "listaestablecimientos";
	}
//	
	@PostMapping("/listaestablecimientos")
	public String list(){
		return "listaestablecimientos";
	}

	@GetMapping("/usuarios")
	public String usuarios(){
		return "usuarios";
	}
	
	@PostMapping("/usuarios")
	public String listuser(){
		return "usuarios";
	}
	
}
