public class SavingsAccount extends Account{
	private double creditLimit, interest, loanInterest, period=12;
	public SavingsAccount(double money, double interest){
		super(money);
		this.interest = interest;
	}
	public void debit(double money) {
		if(period > 0) System.out.print("���� ����� �� �����ϴ�.\n");
		else setBalance(super.balance() - money);
	}

	public double getWihfdrawableAccount(){
		if(period>0) return 0;
		return creditLimit + super.balance();
	}
	public void passTime(int period){
		double calculate=1;
		if(this.period!=0) {

			this.period-=period;

		for (int i = 0; i <period ; i++){
			calculate *=1+interest;
		}
		}
		setBalance(super.balance()*calculate);
	}
	
	
}
