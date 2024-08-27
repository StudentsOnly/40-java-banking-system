## Exercise: Abstract Classes - Banking System

#### Objective:

Practice using abstract classes in Java by creating a simple banking system.

#### Description:

You should create a banking system that manages different types of bank accounts. Implement an abstract class BankAccount with common attributes and methods, and two concrete derived classes: SavingsAccount and CheckingAccount. Each account type should have specific properties and methods, and the ability to perform transactions such as deposits and withdrawals.

#### Guidelines:

1.	Create an abstract class BankAccount with the following instance variables:
  	- String accountNumber
  	- String accountHolder
  	- double balance
2.	Implement getter and setter methods for the accountNumber, accountHolder, and balance instance variables.
3.	Include the following abstract methods in the BankAccount class:
  	- public abstract void deposit(double amount) - to deposit money 
	  into the account.
  	- public abstract void withdraw(double amount) - to withdraw money 
        from the account.
  	- public abstract void displayAccountInfo() - to display the account 
        information.
4.	Create a concrete derived class SavingsAccount that inherits from BankAccount.
5.	Add an additional instance variable double interestRate to the SavingsAccount class.
6.	Implement the deposit, withdraw, and displayAccountInfo methods in the SavingsAccount class.
7.	Create another concrete derived class CheckingAccount that inherits from BankAccount.
8.	Add an additional instance variable double overdraftLimit to the CheckingAccount class.
9.	Implement the deposit, withdraw, and displayAccountInfo methods in the CheckingAccount class.
10.	In the main method, create instances of SavingsAccount and CheckingAccount, set their attributes, and perform deposits and withdrawals on these accounts. Display the account information after each transaction.
