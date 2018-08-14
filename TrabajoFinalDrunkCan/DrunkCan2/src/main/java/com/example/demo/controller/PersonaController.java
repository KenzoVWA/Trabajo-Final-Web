package com.example.demo.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.cas.userdetails.GrantedAuthorityFromAssertionAttributesUserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Persona;
import com.example.demo.service.IPersonaService;
import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("/")
public class PersonaController {
	@Autowired
	private IPersonaService personaService;

	@GetMapping("/personas")
	public String findAll(Model model) {

		model.addAttribute("personas", personaService.findAll());
		model.addAttribute("persona", new Persona());
		return "usuarios";

	}

	@PostMapping("/registrapersonas")
	public String save(@Valid Persona persona, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/establecimientos";
		}
		personaService.save(persona);
		return "redirect:/establecimientos";
	}

	@GetMapping({ "login/loginsuccess" })
	public String loginCheck() {
		// Objeto User de Spring, getPrincipal es el usuario principal de la
		// sesion
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		/*Collection<GrantedAuthority> roles = user.getAuthorities();
		for (GrantedAuthority r : roles) {
			if(r.getAuthority().equals("ROLE_CLIENTE"){
				
			}
		}*/
		// foreach(GrantedAutority rol: roles)role_user
		// {
		// if(rol.getautority.equals()"rol_usrr")
		// }
		// model.addAttribute("username", user.getUsername());

		if (user.getUsername().equals("hamp")) {
			return "redirect:/personas";
		} else {
			return "redirect:/establecimientos";
		}
	}
}
