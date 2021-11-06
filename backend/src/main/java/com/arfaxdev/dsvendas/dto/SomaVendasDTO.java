package com.arfaxdev.dsvendas.dto;

import java.io.Serializable;

import com.arfaxdev.dsvendas.entities.Vendedor;

public class SomaVendasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomeVendedor;
	private Double soma;

	public SomaVendasDTO() {
	}

	public SomaVendasDTO(Vendedor vendedor, Double soma) {
		this.nomeVendedor = vendedor.getNome();
		this.soma = soma;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}

}
