
# LeetCode Solutions in Java

This repository contains my solutions to **LeetCode** problems, organized by difficulty (Easy, Medium, Hard). Each solution includes:
- **Code Implementation**: Written in Java.
- **Explanations**: Clear and concise problem descriptions with step-by-step solutions.
- **Unit Tests**: Ensuring the correctness of each solution with multiple test cases.

---

## Table of Contents

### Easy Problems
- [Final Prices With a Special Discount in a Shop](src/main/java/org/example/easy/FinalPricesWithSpecialDiscount.java)

### Medium Problems
- [Maximum Chunks to Make Sorted](src/main/java/org/example/medium/MaxChunksToSorted.java)

### Hard Problems
*(Add links here as you solve more problems)*

---

## Project Structure

This repository follows a structured format for organizing solutions:

```
LeetCode-Solutions/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── example/
│   │   │           ├── easy/
│   │   │           │   ├── FinalPricesWithSpecialDiscount.java
│   │   │           ├── medium/
│   │   │           │   ├── MaxChunksToSorted.java
│   │   │           ├── hard/
│   │   │           └── Main.java
│   └── test/
│       ├── org/
│       │   └── example/
│       │       └── easy/
│       │           ├── FinalPricesWithSpecialDiscountTest.java
│       │       └── medium/
│       │           ├── MaxChunksToSortedTest.java
├── README.md
├── pom.xml
```

---

## How to Use This Repository

### Requirements
1. Java Development Kit (JDK) installed (version 8 or above).
2. Maven installed (for running tests).
3. IntelliJ IDEA or another Java IDE for development.

### Steps to Run the Solutions
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/LeetCode-Solutions.git
   cd LeetCode-Solutions
   ```
2. Open the project in your IDE.
3. Run the `Main` class in the desired package (e.g., `FinalPricesWithSpecialDiscountMain`).

---

## Example Problem: Maximum Chunks to Make Sorted

### Problem Statement
We are given an integer array `arr` of length `n` that contains the numbers from `0` to `n - 1` in random order.

Our task is to split the array into the **maximum number of chunks** such that if we:
1. **Sort each chunk independently**, and
2. **Concatenate all chunks in the original order**,

the result should be the **sorted version** of the array.

### Example Input:
```
arr = [1, 0, 2, 3, 4]
```

### Example Output:
```
Chunks = [[1, 0], [2], [3], [4]]
```

---

## How to Test the Solutions

### Run Unit Tests
This project uses JUnit for testing. To run the tests:
1. Ensure Maven is installed.
2. Run the following command:
   ```bash
   mvn test
   ```

### Example Test Output
For `MaxChunksToSortedTest`:
```
Test case 1 passed.
Test case 2 passed.
Test case 3 passed.
```

---

## Contributing
Feel free to contribute additional solutions or improvements by:
1. Forking the repository.
2. Creating a feature branch.
3. Submitting a pull request.

---

## License
This repository is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
