package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.