package com.arfaxdev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arfaxdev.dsvendas.dto.SomaVendasDTO;
import com.arfaxdev.dsvendas.dto.SucessoVendasDTO;
import com.arfaxdev.dsvendas.dto.VendasDTO;
import com.arfaxdev.dsvendas.entities.Vendas;
import com.arfaxdev.dsvendas.repositories.VendasRepository;
import com.arfaxdev.dsvendas.repositories.VendedorRepository;

@Service
public class VendasService {

	@Autowired//injeção de dependência
	private VendasRepository vendasRepository;
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	/**
	 * 
	 * @return uma lista de vendedores
	 */
	@Transactional(readOnly = true)
	public Page<VendasDTO> findAll(Pageable pageable) {
		vendedorRepository.findAll();
		Page<Vendas> resultado = vendasRepository.findAll(pageable);
		//convertendo a lista para dto
		//return resultado.stream().map(x -> new VendasDTO(x)).collect(Collectors.toList());
		return resultado.map(x -> new VendasDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SomaVendasDTO> quantiaVendida() {
		return vendasRepository.quantiaVendida();
	}
	
	@Transactional(readOnly = true)
	public List<SucessoVendasDTO> taxaSucessoAgrupadoPorVendedor() {
		return vendasRepository.taxaSucessoAgrupadoPorVendedor();
	}
}
