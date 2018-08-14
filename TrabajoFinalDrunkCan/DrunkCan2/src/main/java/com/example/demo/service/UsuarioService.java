package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.entity.Rol;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		List<GrantedAuthority> authorities=new ArrayList<>();
		
		Usuario usuario=usuarioRepository.findByUsername(username);
		
		if(usuario==null){
			throw new UsernameNotFoundException("No user found with email:"+username);
		}
		
		authorities = buildAuthorities(usuario.getRol());
		
		return buildUser(usuario, authorities);
	}

	private User buildUser(Usuario usuario, List<GrantedAuthority> authorities) {
		// TODO Auto-generated method stub
		return new User(usuario.getUsername(),
				usuario.getPassword(),
				usuario.isEnable(),
				true, true, true, authorities);
	}

	private List<GrantedAuthority> buildAuthorities(List<Rol> usuarioRoles) {
		// TODO Auto-generated method stub
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for(Rol rol: usuarioRoles){
			authorities.add(new SimpleGrantedAuthority(rol.getRole()));
		}
		
		return authorities;
	}

}
