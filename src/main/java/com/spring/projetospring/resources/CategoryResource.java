package com.spring.projetospring.resources;


import com.spring.projetospring.entities.Category;
import com.spring.projetospring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")   // caminho http
public class CategoryResource {

  @Autowired
  private CategoryService category;

  @GetMapping
  public ResponseEntity<List<Category>> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    List<Category> list = category.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findById(@PathVariable Long id) {
    Category obj = category.findById(id);
    return ResponseEntity.ok().body(obj);
  }


}
