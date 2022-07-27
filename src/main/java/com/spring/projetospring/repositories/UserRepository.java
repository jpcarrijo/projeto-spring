package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface UserRepository extends JpaRepository<CustomUser, Long>{

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.