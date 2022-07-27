package com.spring.projetospring.resources;


import com.spring.projetospring.entities.Order;
import com.spring.projetospring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")   // caminho http
public class OrderResource {

  @Autowired
  private OrderService service;

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    List<Order> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Long id) {
    Order obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }


}
