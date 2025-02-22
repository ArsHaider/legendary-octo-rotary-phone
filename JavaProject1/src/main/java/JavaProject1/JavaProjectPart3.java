package JavaProject1;

public class JavaProjectPart3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {11, 22, 33,},
                {44, 55, 66,},
                {77, 88, 99},
        };

        for (int[] number : numbers) {
            for (int evennumber : number) {
                if (evennumber % 2 == 0) {
                    System.out.print(evennumber + " is an even number.");
                    System.out.print(" ");
                }
            }
        }
    }
}