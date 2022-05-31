package myMethods;

import java.util.Arrays;

public class MyMethods {
    public static int[] numbersAfterFour(int[] userArray) {
        if (Arrays.stream(userArray).noneMatch(number -> number == 4)) {
            throw new RuntimeException("There is no 4 in your array");
        }
        int indexOfLastFour = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 4) {
                indexOfLastFour++;
            }
        }
        int[] arrayWithNumbersAfterLastFour = new int[userArray.length - indexOfLastFour - 1];
        int index = 0;
        for (int i = indexOfLastFour + 1; i < userArray.length; i++) {
            arrayWithNumbersAfterLastFour[index] = userArray[i];
            index++;
        }
        return arrayWithNumbersAfterLastFour;
    }

    public static boolean filterFourAndOne(int[] array) {
        if (Arrays.stream(array).allMatch(x -> x == 1) || Arrays.stream(array).allMatch(x -> x == 4)) {
            return false;
        } else {
            return Arrays.stream(array).allMatch(x -> x == 1 || x == 4);
        }
    }
}