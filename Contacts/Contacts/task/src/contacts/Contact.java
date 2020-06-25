package contacts;

public class Contact {
    String firstName;
    String lastName;
    String phoneNumber;

    public Contact(String fName, String lName, String pNumber) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = pNumber;
        System.out.println("A record created!");
    }


}
