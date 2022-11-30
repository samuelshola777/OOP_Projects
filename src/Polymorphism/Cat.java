package Polymorphism;

import java.util.Scanner;

public class Cat extends  Animal{

    public void printStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of stars");
        int star = scanner.nextInt();

        for (int i = 1; i < star; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
