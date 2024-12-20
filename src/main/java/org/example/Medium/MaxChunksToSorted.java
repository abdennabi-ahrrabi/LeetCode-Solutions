package org.example.Medium;

import java.util.ArrayList;
import java.util.List;

public class MaxChunksToSorted {

    // Method to calculate chunks and display them
    public List<List<Integer>> getChunksAndCount(int[] arr) {
        List<List<Integer>> chunks = new ArrayList<>();
        int maxSoFar = Integer.MIN_VALUE;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);

            // If maxSoFar equals the current index, finalize the current chunk
            if (maxSoFar == i) {
                // Add current chunk to the list
                List<Integer> currentChunk = new ArrayList<>();
                for (int j = start; j <= i; j++) {
                    currentChunk.add(arr[j]);
                }
                chunks.add(currentChunk);

                // Update the start of the next chunk
                start = i + 1;
            }
        }

        return chunks;
    }

    public static void main(String[] args) {
        MaxChunksToSorted solution = new MaxChunksToSorted();

        // Test case 1
        int[] arr1 = {1, 0, 2, 3, 4};
        List<List<Integer>> chunks1 = solution.getChunksAndCount(arr1);
        System.out.println("Test case 1:");
        System.out.println("Chunks Count: " + chunks1.size());
        System.out.println("Chunks: " + chunks1);

        // Test case 2
        int[] arr2 = {4, 3, 2, 1, 0};
        List<List<Integer>> chunks2 = solution.getChunksAndCount(arr2);
        System.out.println("\nTest case 2:");
        System.out.println("Chunks Count: " + chunks2.size());
        System.out.println("Chunks: " + chunks2);

        // Test case 3
        int[] arr3 = {0, 1, 2, 3, 4};
        List<List<Integer>> chunks3 = solution.getChunksAndCount(arr3);
        System.out.println("\nTest case 3:");
        System.out.println("Chunks Count: " + chunks3.size());
        System.out.println("Chunks: " + chunks3);
    }
}
