package com.example.numerosDesordenados.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.numerosDesordenados.model.Numero;
import com.example.numerosDesordenados.repository.NumeroRepository;

@RestController

public class NumeroController {
	@RequestMapping("/numero")
	public String funcionando() {
		return "Está funcionando muito bem";
	}
	
	
	@Autowired
	private NumeroRepository numeros;
		
	
	@PostMapping
	public Numero adicionar(@RequestBody  Numero numero){
		return numeros.save(numero);
		
	}
	@GetMapping("numero/listar")
	public List<Numero> listar(){
		return numeros.findAll();
	}
	

}
