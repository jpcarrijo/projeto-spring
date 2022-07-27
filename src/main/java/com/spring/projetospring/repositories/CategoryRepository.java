package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.