package oop;
import java.util.*;

public class Const {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int std1 ;
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		Circle C1=new Circle();
		Circle C2[]=new Circle[3];
		for(int i=0;i<C2.length;i++) {
			C2[i]=new Circle();
			C2[i].setRaduis(i+3.4);
			C2[i].printInfo();
		}
		
		C1.setRaduis(3.9);
		C1.getArea();
		C1.printInfo();
		TV T1=new TV();
		T1.setVolumeLevel(12);
		T1.setchannel(7);
		T1.TurnOn();
		T1.printInfo();
		
//		String name ;
//		Student student =new Student(2,"de");
//		staticclass cir=new staticclass();
//		cir.printInfo();
//		student.name="zainab";
//		student.std1=1182820;
//		student.printInfo();
//		Student []std =new Student[4];  
//		for(int i=0;i<std.length;i++) {
//			//  std[i]=new Student(4,"sd");
//			  System.out.println("Enter the name: ");
//			  student.name=input.next();
//			  System.out.println("Enter the Id: ");
//			  student.std1=input.nextInt();
//		}
//		for(int i=0;i<std.length;i++) {
//			std[i].printInfo();
//		}
//	}

}}
