package car.rent.system;
import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class Test {
	static int sumOfMoney = 0;
	static int sumOfPerson = 0;
	static int sumOfGoods = 0;
	static String personCars = ""; 
	static String goodsCars = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car[] = {new PersonCar("奥迪A4",500,4),
				     new PersonCar("马自达6",400,4),
				     new PersonAndGoodsCar("皮卡雪6",450,4,2),
		             new PersonCar("金龙",800,20),
		             new GoodsCar("松花江",400,4),
		             new GoodsCar("依维柯",1000,20)};
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("欢迎使用答答租车系统：\n您是否要租车：1是0否");
		int choose = input.nextInt();
		if(choose == 0)
			System.exit(0);
		else if(choose == 1)
			rentCarInterface(car);
	}
	public static void rentCarInterface(Car[] car){
		Scanner input = new Scanner(System.in);
		System.out.println("您可租车的类型及其价目表:");
		System.out.println("序号" + "    汽车名称" + "    租金        " + "     容量");
		
		for(int i = 0;i < car.length;i ++){
			System.out.print(i + 1 + "." + "    ");
			car[i].showCarInfo();
		}
		
		System.out.println("请输入您要租汽车的数量:");
		int numberOfCars = input.nextInt();
		
		for(int i = 0;i < numberOfCars;i ++){
			System.out.println("请输入第" + (i + 1) + "车的序号:");
			int numberCar = input.nextInt();
			
			switch(numberCar){
			case 1:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfPerson += car[numberCar - 1].getCapability();
				personCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			case 2:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfPerson += car[numberCar - 1].getCapability();
				personCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			case 3:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfPerson += car[numberCar - 1].getCapability();
				sumOfGoods += 2;
				personCars += car[numberCar - 1].getName() + "   ";
				goodsCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			case 4:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfPerson += car[numberCar - 1].getCapability();
				personCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			case 5:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfGoods += car[numberCar - 1].getCapability();
				goodsCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			case 6:{
				sumOfMoney += car[numberCar - 1].getRent();
				sumOfGoods += car[numberCar - 1].getCapability();
				goodsCars += car[numberCar - 1].getName() + "   ";
				break;
			}
			}
			
		}
		System.out.println("请输入租车天数:");
		int day = input.nextInt();
		System.out.println("您的账单:");
		System.out.println("****可载人的车有:");
		System.out.print(personCars);
		System.out.println("共载" + sumOfPerson + "人");
		System.out.println("****可载货的车有:");
		System.out.print(goodsCars);
		System.out.println("共载" + sumOfGoods + "吨");
		System.out.println("****租车总价:" + sumOfMoney * day + "元");
	}

}
