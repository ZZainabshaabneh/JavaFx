package inherite;

public class Checking extends account{
public Checking() {
	
}
@Override

 public void depoist(double amount) {
	setBalance(getBalance()+amount); 
}
 @Override

public  void withdraw(double amount) {
	if(getBalance()+1000>amount) {
		setBalance(getBalance()-amount);
		 
	}
	setBalance(getBalance());
}
}
