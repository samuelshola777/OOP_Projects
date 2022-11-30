package IdArrayList;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean again = false;

    private static void runApp(){

        while(again){
            collectContactDetail();
        }
    }

    private static void collectContactDetail() {
        System.out.println("Enter contact name ");
        String name = scanner.nextLine();

        System.out.println("Enter contact number ");
        String number = scanner.nextLine();

        System.out.println("Enter contact address ");
        String address = scanner.nextLine();

        System.out.println("Enter contact email ");
        String email = scanner.nextLine();

        Contact contact = PhoneBook.createContact(name, number, address, email);
        System.out.println(contact.getName() + " saved");

        System.out.println("""
                Do you want to save another contact?
                                
                A. Yes
                B. No
                """);

        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("A")) {

            again = true;
            collectContactDetail();
        }

            }

    private static void displayContacts(){
        PhoneBook.readContact();
    }
    public static void main(String[] args) {
        collectContactDetail();
        displayContacts();
    }
}
