package com.arfaxdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arfaxdev.dsvendas.entities.Vendas;
import com.arfaxdev.dsvendas.entities.Vendedor;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long>{

}
