public class SavingsAccount extends Account implements Valuable{
	private double creditLimit, interest, loanInterest, period=12;
	public SavingsAccount(double money, double interest){
		super(money);
		this.interest = interest;
	}
	public void debit(double money) throws Exception{
		if(period > 0) 
			throw new Exception("아직 출금할 수 없습니다.\n");
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
	@Override
	public double EstimateValue(int month) {
		passTime(month);
		return super.balance();
	}
	

	public String toString(){
		
		return String.format("SavingsAccount_Balance: %.2f",super.balance());
	}

}
