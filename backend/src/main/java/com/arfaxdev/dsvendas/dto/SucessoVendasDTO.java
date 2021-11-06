package com.arfaxdev.dsvendas.dto;

import java.io.Serializable;

import com.arfaxdev.dsvendas.entities.Vendedor;

public class SucessoVendasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomeVendedor;
	private Long clientesVisitados;
	private Long negociosFechados;

	public SucessoVendasDTO() {
	}

	public SucessoVendasDTO(Vendedor vendedor, Long clientesVisitados, Long negociosFechados) {
		this.nomeVendedor = vendedor.getNome();
		this.clientesVisitados = clientesVisitados;
		this.negociosFechados = negociosFechados;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Long getClientesVisitados() {
		return clientesVisitados;
	}

	public void setClientesVisitados(Long clientesVisitados) {
		this.clientesVisitados = clientesVisitados;
	}

	public Long getNegociosFechados() {
		return negociosFechados;
	}

	public void setNegociosFechados(Long negociosFechados) {
		this.negociosFechados = negociosFechados;
	}

}
