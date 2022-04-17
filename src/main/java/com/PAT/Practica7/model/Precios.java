package com.PAT.Practica7.model;

import java.sql.Time;


import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("PRECIOS")
public class Precios {
	private @Column("HORA_CONSUMO") Time hora_consumo;
	private @Column("PRECIO_LUZ_HORA") Float precio;

}