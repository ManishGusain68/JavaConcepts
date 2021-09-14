import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account  {
	
//	public OptionMenu(int customerNumber, int pinNumber, int checkingBalance, int savingBalance) {
//		super(customerNumber, pinNumber, checkingBalance, savingBalance);
//		// TODO Auto-generated constructor stub
//	}


	Scanner menuInput=new Scanner(System.in);
	//DecimalFormat moneyFormat=new DecimalFormat("'$ ###,##0.00");
	DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer> data= new HashMap<>();
	
	
	public void getLogin() {
		int x=1;
		
	do {
		try {
			data.put(952124, 8956);
			data.put(109089, 3456);
			data.put(237865, 8787);
			data.put(345987, 1235);
			
			System.out.println("welcome to the ATM project");
			System.out.println("enter your customer number");
			//Account a=new Account();
			setCustomerNumber(menuInput.nextInt());
			
			System.out.println("enter your PIN number");
			setPinNumber(menuInput.nextInt());
		} catch (Exception e) {
			System.out.println("\n"+"invalid character"+"\n");
			x = 2;
		}
	//}while(x == 1) ;
	
	int cn= getCustomerNumber();
	int pn = getPinNumber();
	if (data.containsKey(cn) && data.get(cn)==pn) {
		getAccountType();
		}else {
			System.out.println("\n"+"wrong customer number or pin number ");
		}
	}while(x == 1) ;
	}


	private void getAccountType() {
	System.out.println("select the account you want to access :");
	System.out.println("Type 1 - Checking account");
	System.out.println("Type 2 - Saving account");
	System.out.println("Type 3 - Exit");
	
	int selection = menuInput.nextInt();
	
	switch(selection) {
	case 1:
		getChecking();
		break;
		
	case 2:
		getSaving();
		break;
		
	case 3:
		System.out.println("thank you for using the ATM");
		break;
		
		default:
		System.out.println("invalid choice");
	}
	
		
	}


	private void getSaving() {
		System.out.println("Saving Account :");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice :");
		
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("saving account balance"+ moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInpput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("thank you for using this ATM, BYE");
			break;
			
			default:
				System.out.println("\n"+"invalid choice"+"\n");
			getChecking();
				
			}
		
	}


	


	private void getChecking() {
		System.out.println("Checking Account :");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice :");
		
		int selection = menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking account balance"+ moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInpput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("thank you for using this ATM, BYE");
			break;
			
			default:
				System.out.println("\n"+"invalid choice"+"\n");
			getChecking();
				
			}
	}


	

}
