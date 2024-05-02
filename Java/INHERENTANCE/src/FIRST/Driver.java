package FIRST;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		GeometricObject G = new GeometricObject( "red", false);
//		GeometricObject C= new Circle();
//		C.setColor("green");
//		C.setFilled(false);
//		System.out.println(C.toString());;
//		Circle Cr = new Circle(0,"red", false);
//		System.out.println("enter the color");
//		Cr.setColor(input.next());
//		
//		Object O = new Circle();
//		//Circle O1 = new Object();
		String []fu= {"zaina","amal","aseel","dina"};
		//methods for convert array to ArrayList 
		ArrayList<String> fui =new ArrayList();
		Collections.addAll(fui, fu);
		Collections.sort(fui);
		Collections.shuffle(fui);//random
		System.out.println(fui);
		List  L =Arrays.asList(fu);//important
		System.out.println(L);
		ArrayList<String> f =new ArrayList();
		System.out.println("Enter the elemants");
		for(int i=0;i<5;i++) {
			
			f.add(i,input.nextLine());
		}
		
		f.remove(1);
		System.out.println(f);
		f.toArray();
		 
//		
//		System.out.println("enter the Raduis");
//		Cr.setRaduis(input.nextDouble()); 
//		Cr.setFilled(false);
//		Cr.printCircle();
//		System.out.println(Cr.toString());;
	}

}
