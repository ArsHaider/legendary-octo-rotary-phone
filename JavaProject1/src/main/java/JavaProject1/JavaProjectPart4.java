package JavaProject1;

public class JavaProjectPart4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99},
        };

        int EvenSum = 0;
        int OddSum = 0;

        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    OddSum += num;
                } else {
                    EvenSum += num;
                }
            }
        }
        System.out.println("The sum of all even numbers is " + EvenSum);
        System.out.println("The sum of all odd numbers is " + OddSum);
    }
}
