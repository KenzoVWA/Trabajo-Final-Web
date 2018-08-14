package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bebida;

@Repository
@Transactional
public interface BebidaRepository extends JpaRepository<Bebida, Integer> {
	
}
