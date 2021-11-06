package com.arfaxdev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arfaxdev.dsvendas.dto.VendedorDTO;
import com.arfaxdev.dsvendas.entities.Vendedor;
import com.arfaxdev.dsvendas.repositories.VendedorRepository;

@Service
public class VendedorService {

	@Autowired//injeção de dependência
	private VendedorRepository vendedorRepository;
	
	/**
	 * 
	 * @return uma lista de vendedores
	 */
	public List<VendedorDTO> findAll() {
		List<Vendedor> resultado = vendedorRepository.findAll();
		//convertendo a lista para dto
		return resultado.stream().map(x -> new VendedorDTO(x)).collect(Collectors.toList());
	}
}
