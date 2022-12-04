package com.codecafe.javabacktobasics.corejava.exception_handling.custom_exceptions;

public class AgeLessThanZeroException extends IllegalArgumentException {

  public AgeLessThanZeroException() {
  }

  public AgeLessThanZeroException(String message) {
    super(message);
  }

  public AgeLessThanZeroException(Throwable cause) {
    super(cause);
  }

  public AgeLessThanZeroException(String message, Throwable cause) {
    super(message, cause);
  }

}
