package FIRST;

public class Circle extends  ABS{
private double raduis;
public Circle() {
	
}
public Circle(double raduis) {
	this.raduis=raduis;
}
//public Circle(double raduis,String color,boolean filled) {
//	super( color, filled);
//	this.raduis=raduis;
//	 
//}
public double getRaduis() {
	return raduis;
}
public void setRaduis(double raduis) {
	this.raduis = raduis;
}
public double getArea() {
	return (Math.pow(raduis, 2))*Math.PI;
}
@Override
public  double getPerimeter() {
	return 2*this.getRaduis()*Math.PI;
}
//public double getPerimeter() {
//	return 2*this.getRaduis()*Math.PI;
//}
//public void printCircle() {
//	System.out.println("the area is "+this.getArea()+"the Perimeter is "+this.getPerimeter());
//}
@Override
public String toString() {
	return super.toString()+ "Circle [raduis=" + raduis + "]";
}

}
