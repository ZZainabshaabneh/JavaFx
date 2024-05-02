package oop;

public class staticclass {
	double raduis=7.4; 
	int numofobject=0;
	staticclass(){
		numofobject++;
	}
	public double getRaduis() {
		return raduis;
	}
	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	public int getNumofobject() {
		return numofobject;
	}
	public void setNumofobject(int numofobject) {
		this.numofobject = numofobject;
	}
	public double getArea() {
		return (raduis*3.14*raduis);
	}
	public void printInfo() {
		System.out.println("the Area is : "+getArea()+" the number of object is : "+numofobject);
	}
}
