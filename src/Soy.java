
public class Soy extends condimenDecorator {
	Beverage beverage;                                                                                                                                                                                 
	public Soy (Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDrdacription()+",Soy";
	}
	public double cost(){
		return 0.15 + beverage.cost();
}
}
