package com.PAT.Practica7.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.PAT.Practica7.service.dto.ConsumoDTO;

public interface RepoConsumo extends CrudRepository<ConsumoDTO, Long> { 
  @Query("SELECT * FROM CONSUMO WHERE ID_CONSUMO. = :idConsumo")
  public Iterable<ConsumoDTO> getClientesById(int idConsumo);

  @Query("SELECT * FROM CONSUMO")
  public Iterable<ConsumoDTO> getClientes();
}