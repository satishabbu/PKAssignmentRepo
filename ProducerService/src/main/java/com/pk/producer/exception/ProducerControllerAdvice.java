package com.pk.producer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.pk.producer.model.ErrorResponse;

@RestControllerAdvice
public class ProducerControllerAdvice {

  @ExceptionHandler(AuthenticationException.class)
  public ResponseEntity<ErrorResponse> handleAuthenticationException(AuthenticationException ex,
      WebRequest request) {

    ErrorResponse error = new ErrorResponse();
    error.setMessage("Authentication error: ");
    error.setStatus(HttpStatus.UNAUTHORIZED.toString());
    error.setErrorType(AuthenticationException.class.getSimpleName());

    return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
  }

  @ExceptionHandler(BadRequestException.class)
  public ResponseEntity<ErrorResponse> handleBadRequestException(BadRequestException ex,
      WebRequest request) {

    ErrorResponse error = new ErrorResponse();
    error.setMessage("Missing headers/parameters: ");
    error.setStatus(HttpStatus.BAD_REQUEST.toString());
    error.setErrorType(BadRequestException.class.getSimpleName());

    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex,
      WebRequest request) {

    ErrorResponse error = new ErrorResponse();
    error.setMessage("Resource not found: ");
    error.setStatus(HttpStatus.NOT_FOUND.toString());
    error.setErrorType(NotFoundException.class.getSimpleName());

    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(GenericException.class)
  public ResponseEntity<ErrorResponse> handleGenericException(GenericException ex,
      WebRequest request) {

    ErrorResponse error = new ErrorResponse();
    error.setMessage("Internal server error: ");
    error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    error.setErrorType(NotFoundException.class.getSimpleName());

    return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
