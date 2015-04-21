package car.rent.system;

public class Car{
	private String name;  //����name����
	private int rent;     //����rent����
	private int capability;   //����Capability ����
	private int carNumberBuy = 0; //����carNumberBuy����

	public Car(String name,int rent,int capability){
		this.name = name;
		this.rent = rent;
		this.capability = capability;
	}
	public void showCarInfo(){
		System.out.print(name + "\t" + rent + "Ԫ/��   ");
	}
	public int getCapability() {
		return capability;
	}
	public int getCarNumberBuy() {
		return carNumberBuy;
	}
	public void setCarNumberBuy(int carNumberBuy) {
		this.carNumberBuy = carNumberBuy ++;
	}
	public int getRent() {
		return rent;
	}
	public String getName() {
		return name;
	}	
	
	
	
}
