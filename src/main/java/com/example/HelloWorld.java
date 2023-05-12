package com.example;

public class HelloWorld {

  private String name;

  public HelloWorld(){
    this.name = "World";
  }

  public HelloWorld(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String greet() {
    return "Hello " + this.name + "!";
  }
}
