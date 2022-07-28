package com.spring.projetospring.services.exceptions;

public class DatabaseExceptions extends RuntimeException {

  private static final long Serializable = 1L;

  public DatabaseExceptions(String msg) {
    super(msg);
  }
}
