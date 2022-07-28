package com.spring.projetospring.resources;


import com.spring.projetospring.entities.User;
import com.spring.projetospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController  // É necessário o registro como componente para injeção de componente
@RequestMapping(value = "/users")  // caminho
public class UserResource {

  @Autowired
  private UserService service;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")  // caminho http
  public ResponseEntity<User> findById(@PathVariable Long id) {
    User obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }

  @PostMapping  // É necessário o registro como componente para injeção de componente
  public ResponseEntity<User> insert(@RequestBody User obj) {
    obj = service.insert(obj);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").
        buildAndExpand(obj.getId()).toUri(); // metodo que retorna a resposta do status 201
    return ResponseEntity.created(uri).body(obj);
  }

  @DeleteMapping(value = "/{id}")  // caminho http
  public ResponseEntity<Void> delete(@PathVariable Long id) { // @PathVariable para o Long id ser reconhecido como uma variável da url
    service.delete(id);
    return ResponseEntity.noContent().build(); // noContent -> retorna resposta vazia
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
    obj = service.update(id, obj);
    return ResponseEntity.ok().body(obj);
  }

}
