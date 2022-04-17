package com.PAT.Practica7.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("CLIENTES")
public class Clientes {
	private @Column("ID_CLIENTE") @Id Long idCliente;
	private @Column("NOMBRE") String customerName;
	private @Column("TEL") String telefono;
	private @Column("PAIS") String pais;

}

