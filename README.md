# BankMVP: Object-Oriented Programming Principles 🏦

## Overview
This repository contains a Minimum Viable Product (MVP) simulating a core banking system. It was developed to practically demonstrate the mastery and application of the four fundamental pillars of Object-Oriented Programming (OOP) in Java.

This project serves as a practical submission for the BITS College Object-Oriented Programming course.

## 📌 The Four Pillars of OOP Demonstrated

This codebase rigidly adheres to standard Java conventions while implementing the following principles:

1. **Abstraction**
   * **Implementation:** Utilizes an `abstract class BankAccount` to serve as a high-level blueprint. It hides complex implementation details and forces all derived child classes to define their own specific `calculateInterest()` behavior.
   
2. **Encapsulation**
   * **Implementation:** State variables (`accountHolder` and `balance`) are marked as strictly `private`. Modification and access to these variables are exclusively controlled through standard public and protected `getter` and `setter` methods, protecting the data integrity of the account.

3. **Inheritance**
   * **Implementation:** Demonstrates hierarchical inheritance where multiple specialized classes (`SavingsAccount` and `CurrentAccount`) extend the base `BankAccount` class using the `extends` keyword, promoting code reusability.

4. **Polymorphism**
   * **Implementation:** * **Dynamic Method Dispatch (Overriding):** Child classes use the `@Override` annotation to provide specific implementations of the `calculateInterest()` method.
     * **Upcasting:** The `main` execution loop stores different child objects inside a single parent-type `BankAccount[]` array, allowing the Java Virtual Machine (JVM) to decide at runtime which specific method to execute.

## 🚀 How to Run the System

1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local environment.
3. Open a terminal and navigate to the directory containing `BankMVP.java`.
4. Compile the code using the Java compiler:
   ```bash
   javac BankMVP.java