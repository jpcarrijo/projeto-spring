package com.spring.projetospring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity           // implantar as anotação para JPA
@Table(name = "tb_category")
public class Category implements Serializable {

  private static final long Serializable = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar ids
  private Long id;
  private String name;

  public Category() {
  }

  public Category(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category)) return false;
    Category category = (Category) o;
    return Objects.equals(getId(), category.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
