# COS 201 — Computer Programming I

COS 201 practical exercises and programming assignments.

## Student Details

- **Name:** Anjorin Olamide Adeola
- **Matriculation Number:** 25/16128
- **Programme:** [Your Programme]
- **Course:** COS 201 — Computer Programming I

## Repository Structure

```
COS-201-assignment/
├── README.md
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Performs arithmetic calculations on two numbers (sum, difference, product and quotient).
   - Checks for a zero divisor before dividing.
2. `week03/AverageCalculator.java`
   - Calculates the total and average of three scores for a named student.
   - Extension exercise: checks that each score is between 0 and 100 before calculating the result.
3. `week03/ItemCost.java`
   - Calculates the total cost using quantity and unit price.
   - Checks that the quantity is greater than 0 and the unit price is not negative.

### How to Run

You need the Java Development Kit (JDK) installed. Check with `java -version` and `javac -version`.

Open a terminal in the `week03` directory:

```bash
cd week03
```

Compile and run the calculator:

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

Compile and run the average calculator:

```bash
javac AverageCalculator.java
java AverageCalculator
```

Compile and run the item-cost program:

```bash
javac ItemCost.java
java ItemCost
```

Type each value when prompted and press **Enter**.

### Sample Runs

**SimpleCalculator**

```
Enter the first number: 20
Enter the second number: 4
Sum: 24.00
Difference: 16.00
Product: 80.00
Quotient: 5.00
```

**AverageCalculator**

```
Enter student name: Amina Bello
Enter score for Course 1: 70
Enter score for Course 2: 80
Enter score for Course 3: 90

--- STUDENT RESULT ---
Student: Amina Bello
Total: 240.00
Average: 80.00
```

**ItemCost**

```
Enter item name: Exercise Book
Enter quantity: 3
Enter unit price: 1500

--- PURCHASE SUMMARY ---
Item: Exercise Book
Quantity: 3
Unit price: 1500.00
Total cost: 4500.00
```

### Testing

Each program was tested with different valid inputs, boundary values and invalid inputs, and the results were checked against the expected calculations.

| Program | Input | Expected result | Actual result |
|---|---|---|---|
| SimpleCalculator | 20, 4 | Sum 24.00, Difference 16.00, Product 80.00, Quotient 5.00 | Correct |
| SimpleCalculator | 7.5, -2.5 | Sum 5.00, Difference 10.00, Product -18.75, Quotient -3.00 | Correct |
| SimpleCalculator | 15, 0 | Quotient not calculated; "Division is undefined for a zero divisor." | Correct |
| AverageCalculator | Amina Bello: 70, 80, 90 | Total 240.00, Average 80.00 | Correct |
| AverageCalculator | 0, 100, 50 (boundary values) | Total 150.00, Average 50.00 | Correct |
| AverageCalculator | 65.5, 72, 88.5 (decimal scores) | Total 226.00, Average 75.33 | Correct |
| AverageCalculator | 70, 105, 80 (score above 100) | Invalid input message; no result | Correct |
| AverageCalculator | -5, 80, 90 (score below 0) | Invalid input message; no result | Correct |
| ItemCost | Exercise Book: 3 × 1500 | Total cost 4500.00 | Correct |
| ItemCost | Biro: 10 × 150.50 | Total cost 1505.00 | Correct |
| ItemCost | Quantity 0 | Invalid input message; no result | Correct |
| ItemCost | Unit price -50 | Invalid input message; no result | Correct |

### Notes

- Enter numbers only (no letters or currency symbols) where a number is requested; otherwise Java stops with an `InputMismatchException`.
- In `ItemCost`, the quantity must be a whole number (for example `3`, not `3.5`).
