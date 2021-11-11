import java.util.Scanner;
public class Task3 {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter something");
       String password = scanner.nextLine();
       String expected = "qwerty";

       if (password.length() == expected.length()) {
           System.out.println("Length is correct");
       } else {
           System.out.println("Error");
       }




    }
}
