package Polymorphism;

import java.util.Scanner;

public class Animal {
    private String name;
    private String color;

    public void eat(){
        System.out.println("munch");
    }
    public String getName(){
        return name;
    }
    public void setName(String name ){
        this.name = name;
    }

    public void printStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of stars");
        int star = scanner.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("sam");

            }
            System.out.println();
        }
    }
    }
