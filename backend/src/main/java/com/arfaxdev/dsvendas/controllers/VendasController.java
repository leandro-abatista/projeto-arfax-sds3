package com.arfaxdev.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfaxdev.dsvendas.dto.VendasDTO;
import com.arfaxdev.dsvendas.dto.VendedorDTO;
import com.arfaxdev.dsvendas.service.VendasService;
import com.arfaxdev.dsvendas.service.VendedorService;

@RestController
@RequestMapping(value = "/vendas")
public class VendasController {

	@Autowired
	private VendasService vendasService;
	
	@GetMapping
	private ResponseEntity<Page<VendasDTO>> findAll(Pageable pageable) {
		Page<VendasDTO> lista = vendasService.findAll(pageable);
		
		return ResponseEntity.ok(lista);
	}
}
