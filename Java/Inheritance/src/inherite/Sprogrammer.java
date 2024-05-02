package inherite;

public class Sprogrammer extends Programer{
private int ExpYear;
public Sprogrammer(String empName,int empId,int empSalary,String programming,int ExpYear) {
	super(empName,empId,empSalary,programming);
	this.ExpYear=ExpYear;
	
}
}
