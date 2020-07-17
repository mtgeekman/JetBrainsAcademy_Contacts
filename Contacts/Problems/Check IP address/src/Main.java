import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ipAddress = scanner.nextLine();

        String regexIP = "([0-9]{1,2}|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])";

        boolean isValid = ipAddress.matches(regexIP);

        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}