package com.spring.projetospring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

  private static final long Serializable = 1L;

  public ResourceNotFoundException(Object id) {
    super("Resource Not Found. Id: " + id);
  }
}
