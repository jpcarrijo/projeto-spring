package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.