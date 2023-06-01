package com.tcc.pharmespress.farmacia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProduto() {
		System.out.println("lista de produtos");
		
		return "produtos";
		
	}
	
	

 
}