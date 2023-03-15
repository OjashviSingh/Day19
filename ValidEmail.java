import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

    public static boolean validateEmail(String email) {
        // Split the email address into 3 mandatory parts and 2 optional parts
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        String[] domainParts = parts[1].split("\\.");
        if (domainParts.length < 2 || domainParts.length > 3) {
            return false;
        }
        String username = parts[0];
        String domain = domainParts[0];
        String tld = domainParts[domainParts.length - 1];
        String subdomain = "";
        if (domainParts.length == 3) {
            subdomain = domainParts[1];
        }

        if (username.length() < 3 || !Character.isLowerCase(username.charAt(0))) {
            return false;
        }
        if (domain.length() < 2 || !Character.isLowerCase(domain.charAt(0))) {
            return false;
        }
        if (tld.length() < 2 || tld.length() > 3) {
            return false;
        }
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_') {
                return false;
            }
        }
        for (char c : subdomain.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.') {
                return false;
            }
        }

        return true;
    }
}
