package onlinelab;
import java.util.ArrayList; // import the ArrayList class
public class Driver {

	public static void main(String[] args) {
		
  
		ArrayList<GO> GOS = new ArrayList<>(); // Create an ArrayList object
//		Circle c1= new Circle();
//		//System.out.print(c1.Color.charAt(0)); it is null 
		
        for(int i=0;i<5;i++) {
        	if(i%2==0) {
        		GOS.add(i, new Circle()); ;
        	}
        	Rectangle R = new Rectangle();
        }
        
        printinfo(GOS);
        
	}
	public static void printinfo(ArrayList GO) {
		 for(int i = 0; i < GO.size(); i++) {   
	            System.out.print(GO.get(i));
	        }  
	}

}
