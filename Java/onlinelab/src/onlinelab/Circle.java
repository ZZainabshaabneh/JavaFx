package onlinelab;

public class Circle extends GO implements IsFillable ,computabl{
private double Raduis;
static String Color;
private String IsFilled;
public Circle() {
	
}
public Circle(double Raduis , String Color ,String IsFilled) {
	this.Color=Color;
	this.Raduis=Raduis;
	this.IsFilled=IsFilled;
}
public double getRaduis() {
	return Raduis;
}
public void setRaduis(double raduis) {
	Raduis = raduis;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public String getIsFilled() {
	return IsFilled;
}
public void setIsFilled(String isFilled) {
	IsFilled = isFilled;
}
@Override
public String toString() {
	return "Circle [Raduis=" + Raduis + ", Color=" + Color + ", IsFilled=" + IsFilled + "]";
}
public double ComArea() {
	 return Math.pow(Raduis, 2)*Math.PI;
}
public  boolean IsFilled() {
	return this.IsFilled();
}
public  String Color() {
	return this.getColor();
}

}
