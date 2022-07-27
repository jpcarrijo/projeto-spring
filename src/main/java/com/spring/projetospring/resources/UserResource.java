package com.spring.projetospring.resources;


import com.spring.projetospring.entities.CustomUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
   public ResponseEntity<CustomUser> findAll() {  // Response Entity tipo de resposta e <> é o genérico que se espera
    CustomUser u = new CustomUser(1L, "Maria", "maria@gmail.com", "99999999", "1234566");
    return ResponseEntity.ok().body(u);
  }
}
