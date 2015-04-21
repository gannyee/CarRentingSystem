package car.rent.system;

public class PersonAndGoodsCar extends Car {

	private int goodCapability;
	public PersonAndGoodsCar(String name, int rent, int personCapability,int goodCapability) {
		super(name, rent, personCapability);
		// TODO Auto-generated constructor stub
		this.goodCapability = goodCapability;
	}
	
	public void showCarInfo(){
		super.showCarInfo();
		System.out.println("‘ÿ»À:" + super.getCapability() + "»À ‘ÿªı£∫" + goodCapability + "∂÷");
	}

	public int getGoodCapability() {
		return goodCapability;
	}	
	
	

}
