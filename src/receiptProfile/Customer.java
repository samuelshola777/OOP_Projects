package receiptProfile;

public class Customer {
    private String name;
    private Address address;
    private String number;
    private String email;

    public Customer(String name,  String number) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public Customer(String name, String number , String email) {
        this.name = name;
        this.email = email;
        this.number = number;
    }
    public Customer(){}

    public Customer(String name, String number, String email, Address address){
        this(name, number, email);
        this.address = address;
    }

    public String toString(){
        return String.format("%s %s %s %s", name, address, number, email);
    }


}
