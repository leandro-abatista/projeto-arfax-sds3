package com.arfaxdev.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfaxdev.dsvendas.VendedorService;
import com.arfaxdev.dsvendas.dto.VendedorDTO;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {

	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping
	private ResponseEntity<List<VendedorDTO>> findAll() {
		List<VendedorDTO> lista = vendedorService.findAll();
		
		return ResponseEntity.ok(lista);
	}
}
