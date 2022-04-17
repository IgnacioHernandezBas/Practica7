package com.PAT.Practica7.service;




import com.PAT.Practica7.service.dto.ClientesDTO;

import com.PAT.Practica7.service.dto.ClientesConsumoDTO;

public interface ClientesService {

    //All data from Customer Table
    Iterable<ClientesDTO> getClientes();
    //Update cliente
    ClientesDTO updateCliente(Long idCliente,ClientesDTO cliente);

    //All Customers con consumos
    Iterable<ClientesConsumoDTO> getClientesWithConsumo();

    //Delete cliente
    void deleteCliente(Long idCliente);


}