package Mystring;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());;

		 
		
		
		
		
		MyString S = new MyString();
		Scanner input = new Scanner(System.in);
		StringBuilder SBR=new StringBuilder();
		String num;
		System.out.println("Enter the number");
		num=input.nextLine();
		System.out.println(S.IsPalyndrom(num));
		/////////////////////////////////////////
		System.out.println(S.Ispalyndrom(num));
		System.out.println(S.replace(num));
//		String name="Zey@n#%ep09";
//		String nam="zainab";
//		S.Filter(name);
//		System.out.println(S.Filter(name));
//		S.Revers(name);
//		System.out.println(S.Revers(name));
//		S.SBR(name);
//		System.out.println(S.SBR(nam));
//		S.SB(nam);
//		System.out.println(S.SB(nam));
//		String DR=S.SB(nam).toString();
//		System.out.println(DR);
//		String rev=SBR.reverse().toString();//important must be to string to be acceptable
//		System.out.println(rev);
	}

}
