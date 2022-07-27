package com.spring.projetospring.services;

import com.spring.projetospring.entities.Order;
import com.spring.projetospring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // É necessário o registro como componente para injeção de componente
public class OrderService {


  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    return repository.findAll();
  }

  public Order findById(Long id) {
    Optional<Order> obj = repository.findById(id);
    return obj.get();   // retorna o obj pelo id
  }
}
