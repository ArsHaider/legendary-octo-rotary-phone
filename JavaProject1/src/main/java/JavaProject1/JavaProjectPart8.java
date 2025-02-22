package JavaProject1;

public class JavaProjectPart8 {
    public static void main(String[] args) {

        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int maximumnumber = numbers[0];
        int minimumnumber = numbers[0];

        for(int number : numbers) {
            if (number < minimumnumber) {
                minimumnumber = number;
            }
            if (number > maximumnumber) {
                maximumnumber = number;
            }
        }
        System.out.println("The maximum number in the array is " + maximumnumber);
        System.out.println("The minimum number in the array is " + minimumnumber);
    }
}