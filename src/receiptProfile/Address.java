package receiptProfile;

public class Address {

    private String streetName;
    private String houseNumber;

    public Address( String street, String houseNumber){

        this.streetName = street;
        this.houseNumber = houseNumber;
    }


    public Address(){}
    public Address( String street){

        this.streetName = street;

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String toString(){
        return  String.format("%2s /%2s", streetName, houseNumber );
    }

}
