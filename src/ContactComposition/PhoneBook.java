package ContactComposition;

import receiptProfile.Address;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private Date date;
    private Address address;
    private Contact contactName = new Contact("samue shola");
    private Contact contactNumber = new Contact("09099332727");



    public PhoneBook(Contact phoneContact, Date date, Address address){
        contacts.add(phoneContact);
        this.address = address;
        this.date = date;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneBook(){}

    public String toString(){
return String.format("""
                
                ======================
                || name : %2s       ||
                -===================== 
                || number : %2s     ||
                ======================  
                || date : %2s        ||
                ======================
                || address : %2s     ||
                =======================       
                """, contactName.getName(), contactName.getNumber(), date, address);
    }

}
