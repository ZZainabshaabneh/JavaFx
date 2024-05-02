package inherite;

import java.util.Date;

public class account {
private int id=0;
private double balance=0;
private Date D;
public account() {
	
}
public account(int id,double balance,Date D) {
	this.balance=balance;
	this.D=D;
	this.id=id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Date getD() {
	return D;
}
  
@Override
public String toString() {
	return "account [id=" + id + ", balance=" + balance + ", D=" + D + "]";
}
public  void withdraw(double amount) {
	if(getBalance()>amount) {
		setBalance(getBalance()-amount);
		 
	}
	setBalance(getBalance());
}
public void depoist(double amount) {
	setBalance(getBalance()+amount); 
}

}
