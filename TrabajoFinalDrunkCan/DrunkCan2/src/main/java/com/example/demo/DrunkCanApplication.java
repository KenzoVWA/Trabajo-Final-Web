package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Persona;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.IPersonaService;

@SpringBootApplication
public class DrunkCanApplication {
	
	private static final Logger log=LoggerFactory.getLogger(DrunkCanApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DrunkCanApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(UsuarioRepository ur, IPersonaService ip){
//		return(args)->{
//			Usuario u=new Usuario();
//			u.setUsername("Dass");
//			u.setPassword("cabro");
//			ur.save(u);
//			
//			Persona p=new Persona();
//			p.setNombre("Christian");
//			p.setApellido("Fernandez");
//			p.setSexo("F");
//			p.setEstatura(0.0);
//			p.setPeso(0.0);
//			p.setUsuario(u);
//			ip.save(p);
//			
//			log.info("Personas");
//			for(Persona pe: ip.findAll())
//				log.info(pe.toString());
//		};
//	}
}
