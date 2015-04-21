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
		Car car[] = {new PersonCar("�µ�A4",500,4),
				     new PersonCar("���Դ�6",400,4),
				     new PersonAndGoodsCar("Ƥ��ѩ6",450,4,2),
		             new PersonCar("����",800,20),
		             new GoodsCar("�ɻ���",400,4),
		             new GoodsCar("��ά��",1000,20)};
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ӭʹ�ô���⳵ϵͳ��\n���Ƿ�Ҫ�⳵��1��0��");
		int choose = input.nextInt();
		if(choose == 0)
			System.exit(0);
		else if(choose == 1)
			rentCarInterface(car);
	}
	public static void rentCarInterface(Car[] car){
		Scanner input = new Scanner(System.in);
		System.out.println("�����⳵�����ͼ����Ŀ��:");
		System.out.println("���" + "    ��������" + "    ���        " + "     ����");
		
		for(int i = 0;i < car.length;i ++){
			System.out.print(i + 1 + "." + "    ");
			car[i].showCarInfo();
		}
		
		System.out.println("��������Ҫ������������:");
		int numberOfCars = input.nextInt();
		
		for(int i = 0;i < numberOfCars;i ++){
			System.out.println("�������" + (i + 1) + "�������:");
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
		System.out.println("�������⳵����:");
		int day = input.nextInt();
		System.out.println("�����˵�:");
		System.out.println("****�����˵ĳ���:");
		System.out.print(personCars);
		System.out.println("����" + sumOfPerson + "��");
		System.out.println("****���ػ��ĳ���:");
		System.out.print(goodsCars);
		System.out.println("����" + sumOfGoods + "��");
		System.out.println("****�⳵�ܼ�:" + sumOfMoney * day + "Ԫ");
	}

}
