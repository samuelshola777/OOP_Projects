package ContactComposition;

import receiptProfile.Address;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(03, 07,2022);

        System.out.printf("your current is %s%n", date);

        Contact contact = new Contact("samuel shola","0909933272");

        Address address = new Address("ilaje road","103 bariga");

        System.out.printf("the address is  %s%n", address);

        System.out.printf("your name and number is  %s%n", contact);
        PhoneBook phoneBook = new PhoneBook(contact,date,address);


        System.out.printf("the every phone book is %n %s ", phoneBook );
    }
}
