package com.d;
import java.io.StringReader;
import java.io.StringWriter;


public class StringProcessor {
    private StringReader reader;

    public StringProcessor(StringReader reader) { // Dependency Injection
        this.reader = reader;
    }

    public void processString() {
        String data = reader.readString();
        System.out.println("Processed String: " + data.toUpperCase());
    }
}