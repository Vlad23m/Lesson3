import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mark = 50;

        System.out.println("Enter number");
        int mark1 = scanner.nextInt();

        if (mark1 >= 50) {
            System.out.println("Done: ");
            System.out.println("PASS");
        } else {
            System.out.println("Done: ");
            System.out.println("Done: FAIL");

        }
    }
}
