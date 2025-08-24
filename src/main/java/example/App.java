package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World from Maven!");
		// New functionality
        System.out.println(getFormattedMessage());
    }
    
    public String getMessage() {
        return "Hello World from Maven!";
    }
}