
public class StraBuzzCoffee {
	public static void main(String[] args){
	Beverage b1 = new Espresso();
	System.out.println(b1.getDrdacription()+"$"+b1.cost());
	System.out.println("----------------------------------------");
	Beverage b2 = new HousBlend();
	b2 = new Mocha(b2);
	b2 = new Whip (b2);
	System.out.println(b2.getDrdacription()+"$"+b2.cost());
	}
}
