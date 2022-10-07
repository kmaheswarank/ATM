package max;
import java.util.*;
public class ATM {
	public static void main(String args[]) {
		int bal=5000,depo,with;
		Scanner src=new Scanner(System.in);
		System.out.println("Welcome to ATM");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.check balance");
		System.out.println("4.exit");
		int ch=src.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter the amount to be withdraw:");
			with=src.nextInt();
			withdraw(bal,with);
			break;
		}
		
		case 2:{
			System.out.println("Enter the amount to be deposited:");
			System.out.println();
			depo=src.nextInt();
			deposit(bal,depo);
			break;
			
		}
		case 3:{
			printbal(bal);
			System.out.println("");
			break;
			
		}
		case 4:
			System.exit(0);
		}
	}
	
	public static  void printbal(int bal) {
		System.out.println("Your current bal:"+bal);
		System.out.println("Have a nice day");
	}
	public static void deposit(int bal,int depo) {
		System.out.println("Deposit operation:");
		bal=bal+depo;
		System.out.println("Your money has been successfully");
		printBal(bal);
				
	}
	public static void printBal( int bal) {
		System.out.println("Your current bal="+bal);
		System.out.println("");
	}
	public static void withdraw(int bal,int with) {
		System.out.println("withdraw op:");
		System.out.println("The withdraw amount"+with);{
			if(bal>=with) {
				bal=bal-with;
				System.out.println("pls collect your amount:");
				printBal(bal);
			}else {
				System.out.println("sorry ! balance insufficent");
				System.out.println();
			}
		}
	}

}
