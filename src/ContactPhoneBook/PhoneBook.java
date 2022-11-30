package ContactPhoneBook;

import java.util.ArrayList;

public class PhoneBook {
    private static ArrayList<Contact> sContacts = new ArrayList<>();

   public static Contact createProfile(String phoneName, String phoneNumber, String email){
       Contact contact = new Contact(phoneNumber, phoneNumber, email );
       sContacts.add(contact);
       return contact;
   }















}
