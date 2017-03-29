public abstract class Account {

	private double account;
 
	public Account (double money){
		account = money;
	}
	public void credit(double money) {
		account += money;
	}
	public double balance() {
		return account;
	}
	protected void setBalance(double money){
		account = money;
	}
	
	public abstract double getWihfdrawableAccount();
	public abstract void passTime(int period);
}