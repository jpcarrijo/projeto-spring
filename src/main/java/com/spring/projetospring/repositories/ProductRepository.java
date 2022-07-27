package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.