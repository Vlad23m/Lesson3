import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();
        String expectedUserName = "Alex";

        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String expectedPass = "QWERty";

        if (!userName.equals(expectedUserName)) {
            System.out.println("It is wrong user name");
        } else {
            System.out.println("It is a right user");
        }

        if (password.length() == expectedPass.length()) {
            System.out.println("Length of pass correct");
        } else {
            System.out.println("The length of password is not correct");
        }
    }
}
