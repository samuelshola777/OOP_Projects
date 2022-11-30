package Polymorphism;

import java.util.Scanner;

//polymorpism simply means a the subclass over righting the methods in the super class
public class Dog extends Animal {
    private int breed;

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("chomp chomp");
    }

    public void printStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of stars");
        int star = scanner.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("&");

            }
            System.out.println();
        }

    }
}

