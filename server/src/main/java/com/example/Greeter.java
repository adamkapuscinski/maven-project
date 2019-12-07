package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *
   * @param someone type String
   * @return String format Hello with text
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
