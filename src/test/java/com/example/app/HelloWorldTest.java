package com.example.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
    @Test
    void printsGreeting() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        HelloWorld.main(new String[]{});
        System.setOut(original);
        String printed = out.toString();
        assertTrue(printed.contains("Hello, Jenkins + Maven!"));
    }
}
