package com.arfaxdev.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arfaxdev.dsvendas.dto.SomaVendasDTO;
import com.arfaxdev.dsvendas.dto.SucessoVendasDTO;
import com.arfaxdev.dsvendas.entities.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long>{

	/**
	 * 
	 * @return o resultado do total de vendas por vendedor
	 */
	@Query("SELECT new com.arfaxdev.dsvendas.dto.SomaVendasDTO(obj.vendedor, SUM(obj.quantiaVendida)) "
			+ " FROM Vendas AS obj "
			+ " GROUP BY obj.vendedor")//usando JPQL
	List<SomaVendasDTO> quantiaVendida();
	
	/**
	 * 
	 * @return a taxa de sucesso de cada vendedor
	 */
	@Query("SELECT new com.arfaxdev.dsvendas.dto.SucessoVendasDTO(obj.vendedor, SUM(obj.clientesVisitados), SUM(obj.negociosFechados)) "
			+ " FROM Vendas AS obj "
			+ " GROUP BY obj.vendedor")//usando JPQL
	List<SucessoVendasDTO> taxaSucessoAgrupadoPorVendedor();
}
