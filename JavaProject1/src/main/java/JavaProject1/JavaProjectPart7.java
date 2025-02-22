package JavaProject1;

public class JavaProjectPart7 {
    public static void main(String[] args) {

        int firstnumber = 0;
        int secondnumber = 1;
        int tenthfibonacci = 10;

        System.out.println("The first 10 numbers in the Fibonacci sequence are " + tenthfibonacci);

        for (int i = 1; i <= tenthfibonacci; ++i) {
            System.out.print(firstnumber + " ");

            int nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;
        }
    }
}
