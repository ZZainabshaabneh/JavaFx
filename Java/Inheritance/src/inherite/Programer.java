package inherite;

public class Programer  extends Employee{
  private String programming;
  //if i delete the defult constractor in employee and i invok super();-->it will be error
  public Programer() {
	  
  }
  public Programer(String empName,int empId,int empSalary,String programming) {
	  
	  super(empName,empId,empSalary);
	  this.programming=programming;
	  super.setEmpId(empId);
	  super.setEmpName(empName);
	  super.setEmpSalary(empSalary);
	 
  }
public String getProgramming() {
	return programming;
}
public void setProgramming(String programming) {
	this.programming = programming;
}
@Override
public String toString() {
	return super.toString()+"Programer [programming=" + programming + "]";
}
 
public boolean equals(Object O) {
	if(O instanceof Employee) {
		return getEmpSalary()==((Employee)O).getEmpSalary();
	}
	return false;
}
  
}
