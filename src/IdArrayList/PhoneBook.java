package IdArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhoneBook {


  private static ArrayList<Contact> contacts = new ArrayList<>();


  public static Contact createContact(String name, String phoneNumber, String address, String email){
    Contact contact = new Contact(name, phoneNumber, email, address);
    contacts.add(contact);
    return contact;
  }

  public static void readContact(){
    for (int i = 0; i < contacts.size(); i++) {
      Contact contact = contacts.get(i);
      System.out.printf("""
              Name: %s
              Address: %s
              Phone: %s
              Email: %s%n
              """, contact.getName(), contact.getAddress(), contact.getNumber(), contact.getEmail());

    }
  }
  public static void upDate(){



  }

}
