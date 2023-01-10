package ardhastudio.classes;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,54,56,8,95,84,22,54,69,48,23,65,75,77,78,96,91,115,5,8,6,7,3,33,32,313
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] result = Arrays.copyOf(numbers, 8);
        System.out.println(Arrays.toString(result));
    }
}
