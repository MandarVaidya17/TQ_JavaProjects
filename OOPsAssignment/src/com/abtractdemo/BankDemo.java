package com.abtractdemo;
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
//and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//and implement the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount{
	int amount;
	abstract void deposite(int amount);
	abstract void withdraw(int amount);
}
class SavingAccount extends BankAccount
{
	int balance=1500;

	@Override
	void deposite(int amount) {
		System.out.println("Deposite in saving account:"+amount+" Balance:"+(amount+balance));
		
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Withdraw from saving account"+amount+" Balance:"+(balance-amount));
		
	}
	
}

class CurrentAccount extends BankAccount
{
	int balance=1000;

	@Override
	void deposite(int amount) {
		System.out.println("Deposite in current account:"+amount+" Balance:"+(amount+balance));
	}
	
	@Override
	void withdraw(int amount) {
		System.out.println("Withdraw from current account:"+amount+" Balance:"+(balance-amount));
		
	}
	
}
public class BankDemo {

	public static void main(String[] args) {
		BankAccount b;
		b=new SavingAccount();
		b.deposite(5000);
		b.withdraw(200);
		b=new CurrentAccount();
		b.deposite(2000);
		b.withdraw(300);

	}

}
