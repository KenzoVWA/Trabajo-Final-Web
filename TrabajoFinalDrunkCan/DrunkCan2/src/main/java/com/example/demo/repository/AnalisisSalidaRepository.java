package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AnalisisSalida;

@Repository
@Transactional
public interface AnalisisSalidaRepository extends JpaRepository<AnalisisSalida, Integer>{

}
