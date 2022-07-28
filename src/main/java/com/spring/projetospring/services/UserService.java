package com.spring.projetospring.services;

import com.spring.projetospring.entities.User;
import com.spring.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // É necessário o registro como componente para injeção de componente
public class UserService {


  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();   // retorna o obj pelo id
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }

}
