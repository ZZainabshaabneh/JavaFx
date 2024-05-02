package inherite;

public class Saving extends account{
@Override
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
