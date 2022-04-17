package com.PAT.Practica7.service.dto;

import java.sql.Time;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ConsumoPreciosDTO {
  Long idConsumo;
  String electrodomestico;
  Integer horas;
  Time hora_consumo ;
  Float precio;
}
