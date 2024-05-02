package onlinelab;

public class Rectangle  extends Circle{
private double hight;
private double width;
public Rectangle() {
	
}
public Rectangle(double hight,double width) {
	super();
	this.hight=hight;
	this.width=width;
}
public double getHight() {
	return hight;
}
public void setHight(double hight) {
	this.hight = hight;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
@Override
public double ComArea() {
	 return this.getHight()*this.getWidth();
}
@Override
public String toString() {
	return "Rectangle [hight=" + hight + ", width=" + width + "]";
}
 
 
}
