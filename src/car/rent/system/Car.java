package car.rent.system;

public class Car{
	private String name;  //定义name变量
	private int rent;     //定义rent变量
	private int capability;   //定义Capability 变量
	private int carNumberBuy = 0; //定义carNumberBuy变量

	public Car(String name,int rent,int capability){
		this.name = name;
		this.rent = rent;
		this.capability = capability;
	}
	public void showCarInfo(){
		System.out.print(name + "\t" + rent + "元/天   ");
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
