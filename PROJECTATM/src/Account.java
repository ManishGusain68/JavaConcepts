import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
    private	int pinNumber;
	private double checkingBalance=0;
    private	double savingBalance=0;
    
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
    
    
//	public Account(int customerNumber, int pinNumber, int checkingBalance, int savingBalance) {
//		super();
//		this.customerNumber = customerNumber;
//		this.pinNumber = pinNumber;
//		this.checkingBalance = checkingBalance;
//		this.savingBalance = savingBalance;
//	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public void getSavingDepositInpput() {
		System.out.println("saving account balance is :"+ moneyFormat.format(savingBalance));
		System.out.print("amount you want to deposit from saving account :");
		double amount= input.nextDouble();
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("new saving account balance is"+ moneyFormat.format(savingBalance));
			
		}
		else {
			System.out.println("balance can not be negative");
		}
		
	}


	public double calcSavingDeposit(double amount) {
		savingBalance += amount;
		return savingBalance;
	
		
	}
	public void getSavingWithdrawInput() {
		System.out.println("saving account balance is :"+ moneyFormat.format(savingBalance));
		System.out.print("amount you want to withdraw from saving account :");
		double amount= input.nextDouble();
		
		if ((savingBalance -amount) >=0) {
			calcSavinggWithdraw(amount);
			System.out.println("new account balance is "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("balance can not be negative");
		
		}
		
		
		
	
		
	}
	
	public double calcSavinggWithdraw(double amount) {
		savingBalance -= amount;
		return savingBalance;
		
	}
	public void getCheckingDepositInpput() {

		System.out.println("checking account balance is :"+ moneyFormat.format(checkingBalance));
		System.out.print("amount you want to deposit from saving account :");
		double amount= input.nextDouble();
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("new checking account balance is"+ moneyFormat.format(checkingBalance));
			
		}
		else {
			System.out.println("balance can not be negative");
		}
		
	
		
	}


	public double calcCheckingDeposit(double amount) {
		checkingBalance += amount;
		return checkingBalance;
		
	}
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance is :"+ moneyFormat.format(checkingBalance));
		System.out.print("amount you want to withdraw from checking account :");
		double amount= input.nextDouble();
		
		if ((checkingBalance -amount) >=0) {
			calcCheckingWithdraw(amount);
			System.out.println("new account balance is "+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("balance can not be negative");
		
		}
		
		
		
	}
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=checkingBalance-amount;
		return checkingBalance;
		
	}
	
    
    

}
