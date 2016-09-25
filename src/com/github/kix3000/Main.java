package com.github.kix3000;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...\n");

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
