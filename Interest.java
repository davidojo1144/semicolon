import java.util.Scanner;

public class Interest{

	public static void main(String[] args){
	
	
	Scanner input;  
	input = new Scanner(System.in);
	
	System.out.println("enter value for balance: ");
	int balance = input.nextInt();
	
	System.out.println("enter value for annualInterestRate: ");
	int annualInterestRate = input.nextInt();

	int payment = balance * (annualInterestRate/1200);
	int display = (annualInterestRate/1200);

	System.out.printf("the payment is %d", balance);
	System.out.printf("the display is %d", annualInterestRate);
	}

}


	


	

		 