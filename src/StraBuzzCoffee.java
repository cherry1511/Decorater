import java.text.NumberFormat;

public class StraBuzzCoffee {
	public static void main(String[] args){
	Beverage b1 = new Espresso(); 
	NumberFormat numFormat = NumberFormat.getInstance();
	System.out.println(b1.getDescription()+"$"+numFormat.format(b1.cost()));
	
	Beverage b2 = new HousBlend();
	b2 = new Mocha(b2);
	b2 = new Whip (b2);
	System.out.println(b2.getDescription()+"$"+numFormat.format(+b2.cost()));
	 
	Beverage b3 = new Decaf();
	b3 = new StreamedMilk(b3);
	b3 = new Whip (b3);
	b3 = new Soy  (b3);
	System.out.println(b3.getDescription()+"$"+numFormat.format(b3.cost()));
	
	
	Beverage b4 = new DarkRoast();
	b4 = new Mocha(b4);
	b4 = new Soy(b4);
	System.out.println(b4.getDescription()+"$"+numFormat.format(b4.cost()));
	}
}