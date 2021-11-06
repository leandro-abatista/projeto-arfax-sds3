package com.arfaxdev.dsvendas.entities;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vendas")
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer clientesVisitados;
	private Integer negociosFechados;
	private Double quantiaVendida;
	private LocalDate dataVenda;

	/* Isso é uma composição */
	@ManyToOne /* muitos para um, Muitas vendas para um vendedor */
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;

	public Vendas() {
	}

	public Vendas(Long id, Integer clientesVisitados, Integer negociosFechados, Double quantiaVendida,
			LocalDate dataVenda, Vendedor vendedor) {
		super();
		this.id = id;
		this.clientesVisitados = clientesVisitados;
		this.negociosFechados = negociosFechados;
		this.quantiaVendida = quantiaVendida;
		this.dataVenda = dataVenda;
		this.vendedor = vendedor;
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendas other = (Vendas) obj;
		return Objects.equals(id, other.id);
	}

}
