import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());
        // /(?(?<=\s)(delish)|(ew))/
        String regex = "((_{0,1}[a-zA-Z]|_[0-9])([^_]*[a-zA-Z0-9]{1,})*)*";

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}
