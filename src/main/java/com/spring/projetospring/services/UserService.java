package com.spring.projetospring.services;

import com.spring.projetospring.entities.User;
import com.spring.projetospring.repositories.UserRepository;
import com.spring.projetospring.services.exceptions.DatabaseExceptions;
import com.spring.projetospring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
    return obj.orElseThrow(() ->
        new ResourceNotFoundException(id));   // tenta retornar o obj pelo id se não encontrar
                                              // retorna a exceção personalizada ResourceNotFoundException
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  public void delete(Long id) {
    try {
      repository.deleteById(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(id);
    } catch (DataIntegrityViolationException e) {
      throw new DatabaseExceptions(e.getMessage());
    }
  }

  public User update(Long id, User obj) {
    try {
      User ent = repository.getReferenceById(id);
      updateData(ent, obj);
      return repository.save(ent);
    } catch (EntityNotFoundException e) {
      throw new ResourceNotFoundException(id);
    }
  }

  private void updateData(User entity, User obj) {
    entity.setName(obj.getName());
    entity.setEmail(obj.getEmail());
    entity.setPhone(obj.getPhone());
  }

}
