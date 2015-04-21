package car.rent.system;

public class GoodsCar extends Car {

	public GoodsCar(String name, int rent, int capability) {
		super(name, rent, capability);
		// TODO Auto-generated constructor stub
	}

	public void showCarInfo(){
		super.showCarInfo();
		System.out.println("‘ÿªı:" + super.getCapability() + "∂÷");
	}
	
}
