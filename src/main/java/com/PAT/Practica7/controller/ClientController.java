package com.PAT.Practica7.controller;

import  com.PAT.Practica7.service.dto.ClientesDTO;
import  com.PAT.Practica7.service.dto.ClientesConsumoDTO;
import  com.PAT.Practica7.service.ClientesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


  @RestController
  @RequestMapping("/api/v1")
public class ClientController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping("/clientes")
    public ResponseEntity<Iterable<ClientesDTO>> getClientes() {

        var clientes = clientesService.getClientes();

        return ResponseEntity.ok().body(clientes);
    }

    //CUSTOMER-ORDER
    @GetMapping("/clientes/with-orders")
    public ResponseEntity<Iterable<ClientesConsumoDTO>> getClientesWithConsumo() {

        var clientes_consumo = clientesService.getClientesWithConsumo();

        return ResponseEntity.ok().body(clientes_consumo);
    }
  }

