package inherite;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Employee emp1=new Employee();//object of employee
		Programer pro =new Programer();
		Employee Prog =new Programer();//polymorphisim it will arrive to employee method
		Employee prog1=(Employee)pro;//another define for polymorphisim
		if(emp1 instanceof Programer) { // is the empl from Programer
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
       Object O1=new Object();// O1 object of object
       Object O2 =new Employee();// O1 object of object
       //Employee O3=new Object();// can't do object from employee but the oppiste i can
       System.out.println(pro.equals(O2));
       Programer [] PR=new Programer[3];
       for(int i=0;i<PR.length;i++) {
    	   PR[i]=new Programer();
    	   PR[i].setEmpSalary(i+4);
    	   
       }
       System.out.println((max(PR)).toString());
       
       
       account []C=new account[4];
       for(int i=0;i<C.length;i++) {
    	   C[i]=new account();
    	   C[i].setBalance(i+4);
    	   
       }
      
           
       
       
      
       
       
       
//      ArrayList<Sprogrammer>Senior =new  ArrayList<>();
//      for(int i=0;i<4;i++) {
//    	  Senior.add(i, new Sprogrammer());
//    	  
//    	  
//      }
	}
	 public static Programer max(Programer []p) {//important
  	   Programer max=p[0];
         	for(int i=1;i<p.length;i++) {
         		if(max.getEmpSalary()>p[i].getEmpSalary()) {
         			 max=p[i];
         		}
         	}
         	return max;
     }
         	
}
