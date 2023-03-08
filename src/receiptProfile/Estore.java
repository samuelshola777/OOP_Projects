package receiptProfile;

import java.util.ArrayList;

public class Estore {
    private ArrayList<String> products = new ArrayList<>();
    private  ArrayList<Integer> price = new ArrayList<>();

    public Estore(ArrayList<String> products, ArrayList<Integer> price) {
        this.products = products;
        this.price = price;
    }

    public Estore() {
    }

    @Override
    public String toString() {
        String response = "";
        for (int i = 0; i < products.size(); i++) {
            response += String.format("%-30s %-10d%n", products.get(i), price.get(i));
        }
        return response;
    }

}