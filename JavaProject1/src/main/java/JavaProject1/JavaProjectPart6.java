package JavaProject1;
import java.util.Scanner;
public class JavaProjectPart6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to see if it is a prime number");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");

        } else if (number == 2) {
            System.out.println(number + " is a prime number.");

        } else {

            int i;
            for (i = 2; i <= Math.sqrt(number); i++) {

                if ((number % i) == 0) {
                    System.out.println(number + " is not a prime number.");
                    break;

                }
            }

            if (i > Math.sqrt(number)) {
                System.out.println(number + " is a prime number.");

            }
        }
    }
}
