package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

  @Test
  public void testHelloWorld() {
    final HelloWorld helloWorld = new HelloWorld();

    assertEquals("World", helloWorld.getName());
    assertEquals("Hello World!", helloWorld.greet());
  }

  @Test
  public void testHelloJohn() {
    final HelloWorld helloWorld = new HelloWorld("John");

    assertEquals("John", helloWorld.getName());
    assertEquals("Hello John!", helloWorld.greet());
  }
}