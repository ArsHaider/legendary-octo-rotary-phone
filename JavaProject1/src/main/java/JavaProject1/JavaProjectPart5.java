package JavaProject1;
import java.util.Scanner;
public class JavaProjectPart5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int firstnumber = input.nextInt();

        System.out.println("Enter the second number ");
        int secondnumber = input.nextInt();

        firstnumber = firstnumber + secondnumber;
        secondnumber = firstnumber - secondnumber;
        firstnumber = firstnumber - secondnumber;

        System.out.println("The first number is now " + firstnumber);
        System.out.println("The second number is now " + secondnumber);
    }
}
