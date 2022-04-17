package com.PAT.Practica7.model;

import java.sql.Time;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("CONSUMO")
public class Consumo {
	private @Column("ID_CONSUMO") @Id Long idConsumo;
	private @Column("ID_CLIENTE") Long customerId;
	private @Column("ELECTRODOMESTICO") String electrodomestico;
  private @Column("HORAS_USO") Integer horas;
  private @Column("HORA_CONSUMO") Time hora_consumo ;

}
