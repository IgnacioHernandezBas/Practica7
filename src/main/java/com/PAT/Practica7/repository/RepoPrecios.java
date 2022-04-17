package com.PAT.Practica7.repository;



import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.PAT.Practica7.model.Precios;

public interface RepoPrecios extends CrudRepository<Precios, Long> {
  @Query("SELECT * FROM PRECIOS WHERE HORA_CONSUMO. = :hora_consumo")
  public Iterable<Precios> getPrecioByHora(int hora_consumo);

  @Query("SELECT * FROM PRECIOS")
  public Iterable<Precios> getPrecios();
 }