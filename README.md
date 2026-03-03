# Banking Management System (Java - Terminal Based)

## Overview

A console-based Banking Management System built using Core Java. This project demonstrates object-oriented programming principles, file handling for persistent storage, and modular project structuring using packages.

The system allows users to create accounts, deposit and withdraw money, and store account data permanently using a text file.

---

## Features

* Create new bank accounts
* Deposit money
* Withdraw money
* View all accounts
* Persistent data storage using file handling
* Structured project architecture using packages

---

## Tech Stack

* Java (Core Java)
* OOP (Encapsulation, Abstraction)
* File Handling
* Collections (ArrayList)
* Terminal / CLI Interface

---

## Project Structure

```
BankingManagementSystem/
│
├── src/
│   ├── model/
│   │   └── Account.java
│   │
│   ├── service/
│   │   └── BankService.java
│   │
│   ├── util/
│   │   └── FileHandler.java
│   │
│   └── Main.java
│
└── data/
    └── accounts.txt
```

---

## How It Works

1. The user interacts with the system through a terminal-based menu.
2. All account-related operations are handled through the service layer.
3. Account data is stored in `accounts.txt` inside the `data` folder.
4. Data is loaded when the program starts and saved after every transaction.

---

## How to Run

### Step 1: Compile

```
javac src/Main.java
```

### Step 2: Run

```
java src/Main
```

(Ensure the `data` folder exists before running.)

---

## Sample Stored Data Format

```
101,Aditya,5000.0
102,Rahul,8000.0
```

Format:

```
AccountNumber,Name,Balance
```

---

## Learning Outcomes

* Understanding layered architecture (Model → Service → Utility)
* Implementing file-based data persistence
* Applying OOP principles in real-world scenarios
* Building structured Java projects

---

## Future Improvements

* Add PIN-based authentication
* Add transaction history tracking
* Implement fund transfer between accounts
* Convert to GUI using JavaFX or Swing
* Use database (MySQL) instead of file storage

---

## Author

Aditya Bhardwaj
B.Tech - Computer Science Engineering

---

This project is built for academic learning and practical understanding of Java application development.
