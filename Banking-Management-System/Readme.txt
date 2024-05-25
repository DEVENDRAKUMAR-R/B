Banking Management System

Overview:

1.The Banking Management System is a Java-based application that provides various banking functionalities. 
2.This system allows users to register, log in, and manage their bank accounts. 
3.The application interacts with a MySQL database to store and retrieve data.

Features:-

1.User Registration and Login: Users can register and log in to the system.
2.Account Management: Users can open a new bank account, debit money, credit money, transfer money, and check their account balance.
3.Transaction History: Users can view the history of their transactions.

Technologies Used:-

Java: The primary programming language used to develop the application.
MySQL: The database management system used to store user and account data.
JDBC: Java Database Connectivity to connect and interact with the MySQL database.

Setup and Installation:-

Prerequisites

Java Development Kit (JDK) installed.
MySQL Server installed.
A MySQL database named banking_system with the necessary tables.

Project Setup:-

Clone the repository:

git clone https://github.com/your-username/Banking-Management-System.git

Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

Update the database connection details in BankingApp.java:

private static final String url = "jdbc:mysql://localhost:3306/banking_system";
private static final String username = "root";
private static final String password = "root";

Usage:
1.Register: Create a new user account.
2.Login: Log in using the registered email and password.
3.Account Management:
	Open a new bank account.
	Debit, credit, or transfer money.
	Check account balance.
	View transaction history.

Code Structure:

1.BankingApp.java: The main class that contains the entry point and handles user interactions.
2.User.java: Manages user registration and login functionalities.
3.Accounts.java: Manages bank account-related operations.
4.AccountManager.java: Handles transactions such as debit, credit, and transfer of money.

Author
Devendrakumar R.


