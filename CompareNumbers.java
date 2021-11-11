import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("The number " + x +  " has the greatest value");
        } else if  (x < y) {
            System.out.println("The number " + y +  " has the greatest value");
        }


    }

}
