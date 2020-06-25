package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String fName = scanner.nextLine();
        System.out.println("Enter the surname of the person:");
        String lName = scanner.nextLine();
        System.out.println("Enter the number:");
        String pNumber = scanner.nextLine();

        Contact contact = new Contact(fName, lName, pNumber);


    }
}
