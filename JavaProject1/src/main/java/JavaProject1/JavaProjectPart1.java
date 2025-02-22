package JavaProject1;

public class JavaProjectPart1 {
    public static void main(String[] args) {

        int[] temps={33, 44, 55, 66, 77, 88, 99};

        int HighestTemperature=temps[0];
        int LowestTemperature=temps[0];

        for (int temperature:temps) {
            if (temperature>HighestTemperature) {
                HighestTemperature=temperature;
            }
            if (temperature<LowestTemperature) {
                LowestTemperature=temperature;
            }
        }
        System.out.println(HighestTemperature+" is the highest temperature, it's hot.");
        System.out.println(LowestTemperature+" is the lowest temperature, it's cold.");
    }
}
