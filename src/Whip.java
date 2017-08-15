
public class Whip extends condimenDecorator {
	 Beverage beverage;                                                                                                                                                                                 
		public Whip (Beverage beverage){
			this.beverage = beverage;
		}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDrdacription()+",Whip";
		
	}
	public double cost(){
		return 0.10 + beverage.cost();
	}
}
