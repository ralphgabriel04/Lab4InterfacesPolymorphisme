Here's the English version of the README:

# 🔢 Polynomial Project - Algebraic Manipulation in Java

## 📌 Description
This project implements a polynomial manipulation system in Java, allowing management and manipulation of polynomial expressions. It demonstrates several object-oriented programming concepts:

✅ Interface and multiple implementations (LinkedList and Vector)
✅ Custom exception handling
✅ Term comparison and sorting
✅ Java Collections manipulation
✅ Polynomial simplification and addition

## 🛠️ Technologies Used
- Java 17 (or compatible version)
- Java Collections Framework (List, Set, Map)

## 📂 Project Structure
```
/src
├── Term.java
├── Polynomial.java
├── LLPolynomial.java
├── VectorPolynomial.java
├── PolynomialToolbox.java
├── TermComparator.java
├── ZeroCoefficientException.java
└── Driver.java
```

## 📜 Key Files

### 1️⃣ Term.java
Represents a polynomial term with coefficient, variable, and exponent. Includes validation to prevent zero coefficients.

### 2️⃣ Polynomial.java
Interface defining basic polynomial operations (adding/removing terms, retrieving variables/exponents).

### 3️⃣ LLPolynomial.java & VectorPolynomial.java
Two different implementations of the Polynomial interface, using ArrayList and Vector respectively.

### 4️⃣ PolynomialToolbox.java
Utility class providing advanced operations like polynomial simplification and addition.

### 5️⃣ TermComparator.java
Custom comparator for sorting terms based on their variables and exponents.

## 🚀 Features

### Polynomial Manipulation
- ✨ Creation and modification of polynomial terms
- 🔄 Automatic expression simplification
- ➕ Polynomial addition
- 🔍 Term lookup by variable and exponent

### Validation and Security
- ⚡ Zero coefficient handling via ZeroCoefficientException
- 🛡️ Input validation
- 🔒 Term immutability

## 📈 Example Usage
```java
// Creating a polynomial
Polynomial p1 = new LLPolynomial();
p1.addTerm(new Term(2.0, 'x', 2));  // 2x²
p1.addTerm(new Term(3.0, 'x', 1));  // + 3x

// Simplification
Polynomial simplified = PolynomialToolbox.simplify(p1);
```

## 🎯 Future Improvements
- ✅ Additional operations (multiplication, derivation)
- ✅ Graphical user interface
- ✅ Polynomial expression parser
- ✅ Polynomial import/export functionality

## 🧪 Testing
The project includes a Driver class for testing various polynomial operations and validating the implementation.

## 📜 License
This project is licensed under the MIT License - feel free to use, modify, and distribute.

## 🤝 Contributing
Contributions are welcome! Please feel free to submit pull requests or open issues for improvements and bug fixes.
