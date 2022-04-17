package com.PAT.Practica7.service;


import com.PAT.Practica7.service.dto.ConsumoDTO;
import com.PAT.Practica7.service.dto.ConsumoPreciosDTO;

public interface ConsumoService {
  //All data from Customer Table
  Iterable<ConsumoDTO> getClientes();
  //Update cliente
  ConsumoDTO updateConsumo(Long idConsumo,ConsumoDTO consumo);

  //All Customers con consumos
  Iterable<ConsumoPreciosDTO> getConsumoWithPrecios();

  //Delete cliente
  void deleteConsumo(Long idConsumo);

}