package com.example.numerosDesordenados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.numerosDesordenados.model.Numero;

@Repository
public interface NumeroRepository extends JpaRepository<Numero,Long>{
	
}
