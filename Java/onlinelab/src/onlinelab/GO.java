package onlinelab;
import java.util.*;
public  abstract class GO implements computabl {
private String Color;
private boolean IsFilled;
Date D=new Date();
public GO() {
	
}
public GO(String Color,boolean IsFilled) {
	this.Color=Color;
	this.IsFilled=IsFilled;
}

public abstract double ComArea();

}
