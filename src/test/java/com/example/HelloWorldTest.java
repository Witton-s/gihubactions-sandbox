package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testGetMessage() {
        String expected = "Hello, World from Gradle!";
        String actual = HelloWorld.getMessage();
        assertEquals(expected, actual, "メッセージが期待通りであること");
    }
}