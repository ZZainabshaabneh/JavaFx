package oop;

public class Student {

	int std1;
	String name;
	

public void printInfo() {
	System.out.println("the student name is "+name+" and id "+std1+"");
}
public Student(int std1,String name) {
	this.name=name;
	this.std1=std1;
}
public int getStd1() {
	return std1;
}
public void setStd1(int std1) {
	this.std1 = std1;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}