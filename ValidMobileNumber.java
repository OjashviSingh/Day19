import java.util.Scanner;

public class ValidMobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        boolean isValid = validateMobileNumber(mobileNumber);

        if (isValid) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 13) {
            return false;
        }
        if (!mobileNumber.startsWith("91 ")) {
            return false;
        }
        for (char c : mobileNumber.substring(3).toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
