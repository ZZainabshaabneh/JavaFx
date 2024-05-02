package oop;

public class Circle {
double raduis;
int numofobj=0;
public Circle() {
	numofobj++;
}
public Circle(double raduis) {
	this.raduis=raduis;
	 
}
public double getRaduis() {
	return raduis;
}
public void setRaduis(double raduis) {
	this.raduis = raduis;
}
public int getNumofobj() {
	return numofobj;
}
public double getArea() {
	return this.raduis*this.raduis*Math.PI;
}
public void printInfo() {
	System.out.println("the raduis you Entered is : "+getRaduis()+" the number od object is : "+numofobj+" the area is :"+getArea());
}
}
