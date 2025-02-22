package JavaProject1;

public class JavaProjectPart9 {
    public static void main(String[] args) {

        int[] array = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
        int maximum = array[0];
        int nextnumber = array[0];

        for (int numbers : array) {
            if (numbers > maximum) {
                maximum = numbers;
            }
        }
        for (int nextnumbers : array) {
            if (nextnumbers != maximum) {
                if (nextnumbers > nextnumber) {
                    nextnumber = nextnumbers;
                }
            }
        }
        System.out.println("The second largest number in the array is " + nextnumber);
    }
}