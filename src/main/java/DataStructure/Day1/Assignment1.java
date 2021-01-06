package DataStructure.Day1;

import java.util.Arrays;
import java.util.Comparator;

public class Assignment1 {

    // 1. Reverse order of an array of unordered integers.

    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5, 8, 2, 4, 1};
        Arrays.asList(9, 6, 3, 5, 8, 2, 4, 1).stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));
        Arrays.asList(9, 6, 3, 5, 8, 2, 4, 1).stream().sorted().forEach(num1 -> System.out.println(num1));

       Arrays.asList(9, 6, 3, 5, 8, 2, 4, 1).stream().filter(num2 -> num2 % 2 == 0).sorted(Comparator.reverseOrder()).forEach(num2 -> System.out.print(num2));

        //System.out.println(numbersStream.filter(number -> number % 2 != 0).count());
    }
}
