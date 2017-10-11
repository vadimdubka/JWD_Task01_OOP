import java.util.Arrays;

public class Test { // TODO Удалить тестовый класс
    public static void main(String[] args) {
        String pattern = "Oven : POWER_CONSUMPTION=|, WEIGHT=|, CAPACITY=|, DEPTH=|, HEIGHT=|, WIDTH=|;";
        String line = "Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;";
        String[] values = line.split(pattern);
        System.out.println(values.length);
        System.out.println(Arrays.toString(values));
    }
}
