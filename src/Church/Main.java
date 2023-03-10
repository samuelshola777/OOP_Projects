package Church;

public class Main {
    public static void main(String[] args) {



        Church churchProfile = new Church();
        churchProfile.createChurchMember("chirock","13");
        churchProfile.createChurchMember("joshua","23");
        churchProfile.createChurchMember("john","33");
        churchProfile.createChurchMember("Samuel_shola","23");

        churchProfile.checkNumberOfMember();

        System.out.println();
        churchProfile.viewAllChurchMember();


    }
}
