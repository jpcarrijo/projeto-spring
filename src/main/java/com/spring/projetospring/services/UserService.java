package com.spring.projetospring.services;

import com.spring.projetospring.entities.CustomUser;
import com.spring.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // É necessário o registro como componente para injeção de componente
public class UserService {


  @Autowired
  private UserRepository repository;

  public List<CustomUser> findAll() {
    return repository.findAll();
  }

  public CustomUser findById(Long id) {
    Optional<CustomUser> obj = repository.findById(id);
    return obj.get();   // retorna o obj pelo id
  }
}
