import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new CheckingAccount(100,50.0,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		
		//CheckingAccount
		Scanner scan = new Scanner(System.in);
		double amount;
	
		
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능금액: %.2f\n",account1.balance(),account1.getWihfdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		((CheckingAccount)account1).debit(amount);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능금액: %.2f\n",account1.balance(),account1.getWihfdrawableAccount());
		if(((CheckingAccount)account1).isBankrupred())
		System.out.println("현재 잔액이 대출 가능액을 초과하지 않았습니다.\n");
		else System.out.println("현재 잔액이 대출 가능액을 초과하였습니다.\n");
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능금액: %.2f\n",account1.balance(),account1.getWihfdrawableAccount());

		if(((CheckingAccount)account1).isBankrupred())
		System.out.println("현재 잔액이 대출 가능액을 초과하지 않았습니다.\n");
		else System.out.println("현재 잔액이 대출 가능액을 초과하였습니다.\n");
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능금액: %.2f\n",account1.balance(),account1.getWihfdrawableAccount());

		if(((CheckingAccount)account1).isBankrupred())
		System.out.println("현재 잔액이 대출 가능액을 초과하지 않았습니다.\n");
		else System.out.println("현재 잔액이 대출 가능액을 초과하였습니다.\n");
		
		//SavingsAccount
		System.out.println();		
		System.out.printf("Account2 balance: $ %.2f\t현재출금가능금액: %.2f\n",account2.balance(),account2.getWihfdrawableAccount());
		System.out.print("6 Month later!\n");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f\t현재출금가능금액: %.2f\n",account2.balance(),account2.getWihfdrawableAccount());

		((SavingsAccount)account2).debit(50);
		
		System.out.print("next 6 Month later!\n");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f\t현재출금가능금액: %.2f\n",account2.balance(),account2.getWihfdrawableAccount());
		
		System.out.print("next 1 Month later!\n");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f\t현재출금가능금액: %.2f\n",account2.balance(),account2.getWihfdrawableAccount());


		((SavingsAccount)account2).debit(50);		

		System.out.printf("Account2 balance: $ %.2f\t현재출금가능금액: %.2f\n",account2.balance(),account2.getWihfdrawableAccount());
	
	}
}