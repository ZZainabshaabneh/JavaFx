package inherite;

public class Employee {
   private String empName;
   private int empId;
   private int empSalary;

public Employee(){
	
}
public Employee(String empName,int empId,int empSalary) {
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
}
   
}
