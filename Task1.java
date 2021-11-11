
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter time");
        int time = input.nextInt();
        String Answer = (time < 18) ? "Good day" : "Good evening";
        System.out.println(Answer);

    }
}