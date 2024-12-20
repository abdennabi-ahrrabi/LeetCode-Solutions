
# Maximum Chunks to Make Sorted

## Problem Statement
We are given an integer array `arr` of length `n` that contains the numbers from `0` to `n - 1` in random order.

Our task is to split the array into the **maximum number of chunks** such that if we:
1. **Sort each chunk independently**, and
2. **Concatenate all chunks in the original order**, 

the result should be the **sorted version** of the array.

---

## How We Solved It

We solve this problem by keeping track of the **maximum value encountered so far** while iterating through the array. Whenever the maximum value equals the current index `i`, we know that we can split the array at that point.

### Key Insight:
- If `maxSoFar == i`, this means that all values before or at index `i` are less than or equal to `i`, and hence form a valid sorted chunk.

---

## Example Input:
```
arr = [1, 0, 2, 3, 4]
```

### Step-by-Step Process:
1. Start with `maxSoFar = -∞`.
2. Iterate through the array:
   - **Index 0:** Value = 1, `maxSoFar = max(-∞, 1) = 1`
   - **Index 1:** Value = 0, `maxSoFar = max(1, 0) = 1` (since `maxSoFar == 1`, finalize the chunk `[1, 0]`).
   - **Index 2:** Value = 2, `maxSoFar = max(1, 2) = 2` (finalize the chunk `[2]`).
   - **Index 3:** Value = 3, `maxSoFar = max(2, 3) = 3` (finalize the chunk `[3]`).
   - **Index 4:** Value = 4, `maxSoFar = max(3, 4) = 4` (finalize the chunk `[4]`).

### Final Output:
```
Chunks = [[1, 0], [2], [3], [4]]
```

---

## Visual Explanation with Arrays

### Initial Array:
| Index | 0 | 1 | 2 | 3 | 4 |
|-------|---|---|---|---|---|
| Value | 1 | 0 | 2 | 3 | 4 |

### Chunks After Splitting:
| Chunks        |
|---------------|
| [1, 0]       |
| [2]          |
| [3]          |
| [4]          |

---

## Code Implementation
Here is the Java code that implements this logic:

```java
public class MaxChunksToSorted {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (maxSoFar == i) {
                chunks++;
            }
        }
        return chunks;
    }
}
```

---

## Complexity Analysis

### Time Complexity:
- The loop runs `n` times, so the time complexity is **O(n)**.

### Space Complexity:
- We use only a few extra variables, so the space complexity is **O(1)**.

---

## Why This Solution Works
- The maximum value at any point indicates whether all elements before that index are correctly placed.
- If `maxSoFar == i`, we can finalize a chunk.

---

## Potential Enhancements
- We can extend this solution to a more complex version where the array might contain duplicates or elements out of the expected range, which would require additional data structures.
