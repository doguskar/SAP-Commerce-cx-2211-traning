package com.rest.integration.util.exception;

public class RestCommandException extends Exception {

  public RestCommandException(Throwable cause) {
    super(cause);
  }

  public RestCommandException(String message) {
    super(message);
  }
}
