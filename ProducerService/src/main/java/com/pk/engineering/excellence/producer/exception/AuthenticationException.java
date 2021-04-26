package com.pk.engineering.excellence.producer.exception;

public class AuthenticationException extends RuntimeException {

  public AuthenticationException() {}

  public AuthenticationException(String message) {
    super(message);
  }
}
