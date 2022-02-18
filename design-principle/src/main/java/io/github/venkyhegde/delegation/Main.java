package io.github.venkyhegde.delegation;

public class Main {
    // the main method which calls printer to print something
    // from this method, it looks looks like printer class is one which prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello World");
    }
}
