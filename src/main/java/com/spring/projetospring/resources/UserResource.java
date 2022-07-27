package com.spring.projetospring.resources;


import com.spring.projetospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
   public ResponseEntity<User> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "1234566");
    return ResponseEntity.ok().body(u);
  }
}
