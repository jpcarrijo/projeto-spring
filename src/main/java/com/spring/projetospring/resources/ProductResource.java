package com.spring.projetospring.resources;


import com.spring.projetospring.entities.Product;
import com.spring.projetospring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")   // caminho http
public class ProductResource {

  @Autowired
  private ProductService product;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    List<Product> list = product.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product obj = product.findById(id);
    return ResponseEntity.ok().body(obj);
  }


}
