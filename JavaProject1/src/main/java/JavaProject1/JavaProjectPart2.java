package JavaProject1;

public class JavaProjectPart2 {
    public static void main(String[] args) {

        int[] numbers={11, 22, 33, 44, 55, 66, 77, 88, 99};

        int sum=0;

        for (int num:numbers) {
            sum+=num;
        }
        System.out.println("The sum of all the stored elements is: "+sum);
    }
}
