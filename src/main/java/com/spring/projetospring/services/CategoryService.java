package com.spring.projetospring.services;

import com.spring.projetospring.entities.Category;
import com.spring.projetospring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // É necessário o registro como componente para injeção de componente
public class CategoryService {


  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> obj = repository.findById(id);
    return obj.get();   // retorna o obj pelo id
  }
}
