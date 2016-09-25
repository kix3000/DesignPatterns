package com.github.kix3000;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...\n");

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
