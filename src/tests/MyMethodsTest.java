package tests;

import myMethods.MyMethods;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MyMethodsTest {
    @Test
    public void shouldReturnCorrectArray() {
        int[] array = {5, 1, 5, 7, 9, 4, 3, 4, 0, 6, 4, 1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, MyMethods.numbersAfterFour(array));
    }

    @Test
    public void shouldThrowRuntimeException_whenThereIsNoFourInArray() {
        int[] array = {1,1,6,7,45};
        Assertions.assertThrowsExactly(RuntimeException.class, () -> MyMethods.numbersAfterFour(array));
    }

    @Test
    public void negativeTest_whenGivenArrayWithDifferentNumbers() {
        int[] array = {1, 3, 4};
        Assertions.assertFalse(MyMethods.filterFourAndOne(array));
    }

    @Test
    public void negativeTest_whenGivenArrayWithAllFourNumbers() {
        int[] array = {4, 4, 4, 4, 4, 4};
        Assertions.assertFalse(MyMethods.filterFourAndOne(array));
    }

    @Test
    public void positiveTest_whenGivenArrayWithOneAndFour() {
        int[] array = {4, 4, 4, 1, 1, 4, 1};
        Assertions.assertTrue(MyMethods.filterFourAndOne(array));
    }

    @Test
    public void negativeTest_whenGivenArrayWithAllOneNumbers() {
        int[] array = {1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(MyMethods.filterFourAndOne(array));
    }
}