package com.pk.engineering.excellence.producer.exception;

public class NotFoundException extends RuntimeException {

  public NotFoundException() {}

  public NotFoundException(String message) {
    super(message);
  }

}
