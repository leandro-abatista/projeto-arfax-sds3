package com.arfaxdev.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.arfaxdev.dsvendas.entities.Vendas;

public class VendasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer clientesVisitados;
	private Integer negociosFechados;
	private Double quantiaVendida;
	private LocalDate dataVenda;

	private VendedorDTO vendedorDTO;

	public VendasDTO() {
		// TODO Auto-generated constructor stub
	}

	public VendasDTO(Long id, Integer clientesVisitados, Integer negociosFechados, Double quantiaVendida,
			LocalDate dataVenda, VendedorDTO vendedorDTO) {
		this.id = id;
		this.clientesVisitados = clientesVisitados;
		this.negociosFechados = negociosFechados;
		this.quantiaVendida = quantiaVendida;
		this.dataVenda = dataVenda;
		this.vendedorDTO = vendedorDTO;
	}

	public VendasDTO(Vendas entidade) {
		this.id = entidade.getId();
		this.clientesVisitados = entidade.getClientesVisitados();
		this.negociosFechados = entidade.getNegociosFechados();
		this.quantiaVendida = entidade.getQuantiaVendida();
		this.dataVenda = entidade.getDataVenda();
		this.vendedorDTO = new VendedorDTO(entidade.getVendedor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getClientesVisitados() {
		return clientesVisitados;
	}

	public void setClientesVisitados(Integer clientesVisitados) {
		this.clientesVisitados = clientesVisitados;
	}

	public Integer getNegociosFechados() {
		return negociosFechados;
	}

	public void setNegociosFechados(Integer negociosFechados) {
		this.negociosFechados = negociosFechados;
	}

	public Double getQuantiaVendida() {
		return quantiaVendida;
	}

	public void setQuantiaVendida(Double quantiaVendida) {
		this.quantiaVendida = quantiaVendida;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public VendedorDTO getVendedorDTO() {
		return vendedorDTO;
	}

	public void setVendedorDTO(VendedorDTO vendedorDTO) {
		this.vendedorDTO = vendedorDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
