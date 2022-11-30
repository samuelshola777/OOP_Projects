package ContactComposition;

import receiptProfile.Address;

public class Contact {
    private String name;
    private String number;


    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public Contact(){}
//    public Contact(String number){
//        this.number = number;
//    }
    public Contact(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String toString(){
        return String.format("%2S, %2s", getName(), getNumber());
    }
}
