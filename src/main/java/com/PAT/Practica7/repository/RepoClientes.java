package com.PAT.Practica7.repository;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;


import com.PAT.Practica7.service.dto.ClientesDTO;


public interface RepoClientes extends CrudRepository<ClientesDTO, Long> { 
  
    @Query("SELECT * FROM CLIENTES WHERE ID_CLIENTE. = :idCliente")
    public Iterable<ClientesDTO> getClientesById(int idCliente);

    @Query("SELECT * FROM CLIENTES")
    public Iterable<ClientesDTO> getClientes();

}