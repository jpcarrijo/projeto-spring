package com.spring.projetospring.resources;


import com.spring.projetospring.entities.CustomUser;
import com.spring.projetospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService service;

  @GetMapping
  public ResponseEntity<List<CustomUser>> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    List<CustomUser> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<CustomUser> findById(@PathVariable Long id) {
    CustomUser obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }


}
