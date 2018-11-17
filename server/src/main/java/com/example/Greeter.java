package com.example;

/**
 * This is a class.
 
 @author Jamal Mustafa
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

	/**
	* @param someone the name of a person
	* @return the String is the greeting text
	*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
