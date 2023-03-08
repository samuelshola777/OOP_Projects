package ContactPhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    ;
    private static final ArrayList<Contact> justContact = new ArrayList<>();

    private static final  Contact meContact = new Contact();

    public static void main(String[] args) {


        createContact();


    }


    public static Contact createContact() {

        System.out.println("enter name ");
        String name = scanner.nextLine();
        System.out.println("enter number ");
        String number = scanner.nextLine();
        System.out.println("enter email ");
        String email = scanner.nextLine();


        Contact meContact = new Contact(name, number, email);

        justContact.add(meContact);
        System.out.println("contact saved\n");
        System.out.println("you wan add more" +
            " contact to our phone book?\n" +
        "if you wanna add more enter yes\n" +
        "if you don't want to add any more enter no ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            createContact();

        } else {

//            for (int i = 0; i < justContact.size(); i++) {
//                System.out.println(justContact.get(i));
//
//            }
        }

        return meContact;

    }

    public static void printOutContact() {
        for (int i = 0; i < justContact.size(); i++) {
            System.out.println(justContact.get(i));

        }
    }

    public static void upDateContact(int getIndex, Contact contact) {
        System.out.println(justContact.get(getIndex));
        justContact.add(getIndex, contact);
    }

    public static void deleteContact(int index) {
        justContact.remove(index);


    }
    @Override
    public String toString() {
        return String.format("%-15s %-45 %-45s",meContact.getName(), meContact.getNumber(),meContact.getEmail());
    }
}
