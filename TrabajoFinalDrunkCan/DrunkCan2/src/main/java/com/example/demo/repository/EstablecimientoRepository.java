package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Establecimiento;

@Repository
@Transactional
public interface EstablecimientoRepository extends JpaRepository<Establecimiento, Integer>{

}
