package receiptProfile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("ilaje", "103");
        Customer customer1 = new Customer("samuel shola", "09099332737", "samuelShola@gmail.com", address);
        ArrayList<String> product = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in);

            System.out.println("enter product you bought ");
            product.add(scanner.nextLine());

            System.out.println("enter amount ");
            price.add(input.nextInt());

            System.out.println("is that all you wanna buy? \n" +
                    "if you wanna buy more enter yes  \n" +
                    "if you're that's all you wanna buy enter no ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }

        Estore store = new Estore(product, price);
        System.out.println(store);
    }
}
