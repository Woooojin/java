
public class Car implements Valuable{

	private String name;
	private double price;
	private int a;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}

	@Override
	public double EstimateValue(int month) {
		if (a==0) price*=0.8;
		a++;
		for (int i = 0 ; i < month ; i++){
			price *= 0.9;
		}
		return price;
	}

	public String toString(){
		
		return String.format("Car name: %s\ninitial price: %.2f",name,price);
	}

}
