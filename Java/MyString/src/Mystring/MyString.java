package Mystring;

public class MyString {
public String Filter(String N) {
	String A="";
//	for(int i=0;i<N.length();i++) {
//		if(N.charAt(i)!='&'||N.charAt(i)!='#'||N.charAt(i)!='1'||N.charAt(i)!='2'||N.charAt(i)!='3'||N.charAt(i)!='4'||N.charAt(i)!='5'||N.charAt(i)!='6'||N.charAt(i)!='7'||N.charAt(i)!='8'||N.charAt(i)!='9'||N.charAt(i)!='0') {
//		  A+=N.charAt(i);
//			
//		}
//	}
	for(int i=0;i<N.length();i++) {
		if(Character.isLetter(N.charAt(i))) {
			A+=N.charAt(i);
		}
		
	}
	 

	return A;
}
public String Revers(String N) {
	String R="";
	 for(int i=N.length()-1;i>=0;i--) {
		 if(Character.isLetter(N.charAt(i))) {
		 R+=N.charAt(i);
		 }
	 }
	return R;
	
}
public String SBR(String N) {
	String d="";
	StringBuilder Sbr = new StringBuilder(N);
	d+= Sbr.reverse();
	return d;
}
public StringBuilder SB(String N) {
	
	StringBuilder Sbr = new StringBuilder(N);
	
	return  Sbr.reverse();
}
public boolean IsPalyndrom(String num) {
	String res="";
	StringBuilder Sbr = new StringBuilder(num);
	res+= Sbr.reverse().toString();
	if(num.equals(res)) {//*******
		return true;
	}
	return false;
}
public boolean Ispalyndrom(String NUM) {
	String res="";
	StringBuilder Sbr = new StringBuilder(NUM);
	res+= Sbr.reverse().toString();
	for(int i=0;i<NUM.length();i++) {
		for(int j=0;j<res.length();j++) {
			if(Character.isLetter(NUM.charAt(i))!=Character.isLetter(res.charAt(i))) {
				return false;
			}
			
		}
	}
	return true;
}
public String replace(String S) {
	StringBuilder Sbr = new StringBuilder(S);
	 String h="";
		
	 
		S=S.replace("and", "&");
	 
	 
			S=S.replace("to", "2");
	  	 			S=	S.replace("you", "U");
		 
			S=S.replace("for", "4");
	 
        		   
        			   if(S.split(" ").equals("a")) {
        				   h= S ;
        				   for(int i=0;i<h.length();i++) {
        					   S=  h.replace("a","" );
        				   }
        				   
        			       
        			       
        				
        			           }
        			    else 
        			    	if(S.split(" ").equals("e")) {
        			    		 h= S ;
              				   for(int i=0;i<h.length();i++) {
              					 S= h.replace("e", "");
              				   }
        			    		
        			    	   }
        			     else 
        			    	 if(S.split(" ").equals("i")) {
        			    		 h= S ;
              				   for(int i=0;i<h.length();i++) {
              					 S= h.replace("i", "");
              				   }
        			    		
        			    	 }
                      else 
                	   if(S.split(" ").equals("u")) {
                		   h= S ;
        				   for(int i=0;i<h.length();i++) {
        					   S= h.replace("u", "");
        				   }
                		 
                	   }
                       else 
                    	   if(S.split(" ").equals("o")) {
                    		   h= S ;
            				   for(int i=0;i<h.length();i++) {
            					   S= h.replace("o", "");
            				   }
                    		 
                    	   }
        			    	   
        		   
        	   
        	
	

return S;
}
}
  

