import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("BYE");
            System.out.println("Even number");
        } else {
            System.out.println("BYE");
            System.out.println("Odd number");
        }
    }
}