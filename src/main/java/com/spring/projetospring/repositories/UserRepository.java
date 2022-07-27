package com.spring.projetospring.repositories;

import com.spring.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Opcional colocar a anotação @Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
// JPA tem uma inplementação padrão de interface. Não precisa declarar.