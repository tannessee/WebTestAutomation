
public class Logout {
	public void LogoutMethod() {

		System.out.println("Your current balance is $" + Bank.myBalance);
		System.out.print("You are logged out");
		Bank.isLogged = false;
	}

}
