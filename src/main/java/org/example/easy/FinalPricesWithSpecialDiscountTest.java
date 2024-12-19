package org.example.easy;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscountTest {
    public static void main(String[] args) {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();

        // Test case 1
        int[] prices1 = {8, 4, 6, 2, 3};
        int[] result1 = solution.finalPrices(prices1);
        System.out.println("Test case 1: " + Arrays.toString(result1)); // Expected: [4, 2, 4, 2, 3]

        // Test case 2
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] result2 = solution.finalPrices(prices2);
        System.out.println("Test case 2: " + Arrays.toString(result2)); // Expected: [1, 2, 3, 4, 5]

        // Test case 3
        int[] prices3 = {10, 1, 1, 6};
        int[] result3 = solution.finalPrices(prices3);
        System.out.println("Test case 3: " + Arrays.toString(result3)); // Expected: [9, 0, 1, 6]
    }
}
