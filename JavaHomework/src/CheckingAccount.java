public class CheckingAccount extends Account implements Valuable{
	private double creditLimit, interest, loanInterest;
	public CheckingAccount(double money, double creditLimit, double interest, double loanInterest){
		super(money);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	public void debit(double money) {
		if(super.balance() - money >creditLimit+super.balance()) System.out.print("\nDebit amount exceeded account balance");
		else setBalance(super.balance() - money);
	}
	public void nextMonth(){
		if(super.balance()>=0) setBalance(super.balance() + super.balance() * interest);
		else setBalance(super.balance() + super.balance()*loanInterest);
	}
	public boolean isBankrupred(){
		if(super.balance() +creditLimit > 0) return true;
		else return false;
	}
	public double getWihfdrawableAccount(){
		return creditLimit + super.balance();
	}
	public void passTime(int period){
		double calculate=1;
		for (int i = 0; i <period ; i++){
			calculate *=1+interest;
		}
		setBalance(super.balance()*calculate);
	}
	@Override
	public double EstimateValue(int month) {
		passTime(month);
		return super.balance();
	}

	public String toString(){
		
		return String.format("CheckingAccount_Balance: %.2f",super.balance());
	}

}