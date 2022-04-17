package com.PAT.Practica7.controller;

import  com.PAT.Practica7.service.dto.ConsumoDTO;
import  com.PAT.Practica7.service.dto.ConsumoPreciosDTO;
import  com.PAT.Practica7.service.ConsumoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

  @RestController
  @RequestMapping("/api/v1")
public class ConsumoController {

    @Autowired
    private ConsumoService consumoService;

    @GetMapping("/consumos")
    public ResponseEntity<Iterable<ConsumoDTO>> getClientes() {

        var consumos = consumoService.getClientes();

        return ResponseEntity.ok().body(consumos);
    }

    //CUSTOMER-ORDER
    @GetMapping("/consumos/with-precios")
    public ResponseEntity<Iterable<ConsumoPreciosDTO>> getConsumoWithPrecios() {

        var consumos_precios = consumoService.getConsumoWithPrecios();

        return ResponseEntity.ok().body(consumos_precios);
    }
  }

