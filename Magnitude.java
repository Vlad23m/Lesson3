import java.util.Scanner;

public class Magnitude {
    static public void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondnumber = scanner.nextInt();
        if (Math.abs(firstnumber) > Math.abs(secondnumber)) {
            System.out.println(" First number > Second number");
        }
        else if (Math.abs(firstnumber) < Math.abs(secondnumber)) {
            System.out.println(" First number < Second number");
        } else {
            System.out.println(" First number = Second number");
            {
            }
        }
    }
}