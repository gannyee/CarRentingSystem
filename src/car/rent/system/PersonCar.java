package car.rent.system;

public class PersonCar extends Car{

	public PersonCar(String name, int rent, int capability) {
		super(name, rent, capability);
		// TODO Auto-generated constructor stub
	}
	public void showCarInfo(){
		super.showCarInfo();
		System.out.println("‘ÿ»À:" + super.getCapability() + "»À");
	}
	
	
}
