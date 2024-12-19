
# Final Prices With a Special Discount in a Shop

## Problem Statement
You are given an integer array `prices` where `prices[i]` is the price of the `i-th` item in a shop.

There is a special discount for items in the shop:
- If you buy the `i-th` item, you will receive a discount equivalent to `prices[j]` where `j` is the **minimum index** such that `j > i` and `prices[j] <= prices[i]`.
- If no such `j` exists, you will not receive any discount for the `i-th` item.

The task is to return an integer array `answer` where `answer[i]` is the **final price** you will pay for the `i-th` item after considering the discount.

---

## How We Solved It

We solve this problem by iterating through the array and finding the first valid discount for each item. Let's break it down step-by-step:

### Example Input:
```
prices = [8, 4, 6, 2, 3]
```

### Step-by-Step Process:

1. Start with the first item (index 0, price = 8).
    - Look for the first item to the right (index > 0) that is less than or equal to 8.
    - Found: `prices[1] = 4`. Apply the discount: `8 - 4 = 4`.

2. Move to the second item (index 1, price = 4).
    - Look for the first item to the right (index > 1) that is less than or equal to 4.
    - Found: `prices[3] = 2`. Apply the discount: `4 - 2 = 2`.

3. For the third item (index 2, price = 6).
    - Look for the first item to the right (index > 2) that is less than or equal to 6.
    - Found: `prices[3] = 2`. Apply the discount: `6 - 2 = 4`.

4. For the fourth item (index 3, price = 2).
    - There is no item to the right (index > 3) that is less than or equal to 2.
    - No discount. Final price remains `2`.

5. For the last item (index 4, price = 3).
    - There is no item to the right (index > 4).
    - No discount. Final price remains `3`.

### Final Output:
```
answer = [4, 2, 4, 2, 3]
```

---

## Visual Explanation with Arrays

Let's visualize the process step by step using arrays:

### Initial Prices:
| Index | 0 | 1 | 2 | 3 | 4 |
|-------|---|---|---|---|---|
| Prices| 8 | 4 | 6 | 2 | 3 |

### After Applying Discounts:
| Index | 0 | 1 | 2 | 3 | 4 |
|-------|---|---|---|---|---|
| Prices| 4 | 2 | 4 | 2 | 3 |

- At index 0, we subtracted 4 (discount) from 8.
- At index 1, we subtracted 2 (discount) from 4.
- At index 2, we subtracted 2 (discount) from 6.
- At indices 3 and 4, no discounts were applied.

---

## Code Implementation
Here is the Java code that implements this logic:

```java
public int[] finalPrices(int[] prices) {
    int n = prices.length;
    int[] answer = new int[n];

    for (int i = 0; i < n; i++) {
        answer[i] = prices[i]; // Initialize with the original price
        for (int j = i + 1; j < n; j++) {
            if (prices[j] <= prices[i]) {
                answer[i] = prices[i] - prices[j]; // Apply the discount
                break; // Stop once the first valid discount is found
            }
        }
    }
    return answer;
}
```

---

## Complexity Analysis

### Time Complexity:
- The outer loop runs `n` times (once for each item).
- The inner loop may run up to `n-i-1` times in the worst case.
- Overall complexity: **O(n^2)**.

### Space Complexity:
- No additional space is used apart from the result array: **O(1)**.

---

## Why This Solution Works
- We systematically check each item to find the first valid discount.
- By breaking the inner loop as soon as a discount is found, we minimize unnecessary computations.

---

## Potential Optimization
The solution can be optimized to **O(n)** using a stack. Let me know if you’d like to explore this optimization!
