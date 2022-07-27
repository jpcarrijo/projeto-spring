package com.spring.projetospring.config;

import com.spring.projetospring.entities.CustomUser;
import com.spring.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;


  @Override
  public void run(String... args) throws Exception {

    CustomUser u1 = new CustomUser(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
    CustomUser u2 = new CustomUser(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

    userRepository.saveAll(Arrays.asList(u1, u2));
  }
}
// database seeding - popula o banco