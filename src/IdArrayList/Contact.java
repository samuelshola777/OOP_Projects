package IdArrayList;

public class Contact {
    private String name;
    private String address;
    private  String number;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }
    public Contact(){}
    public Contact(String name, String number){
        this.name = name;
        this.number = number;

    }
}
