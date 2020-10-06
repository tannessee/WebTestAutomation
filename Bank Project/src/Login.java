
public class Login {
	
	public void LoginMethod() {

		System.out.print("Please Log In. Enter your Username: ");
		String login = Bank.sc.next();
		System.out.print("Enter your Password: ");
		String password = Bank.sc.next();

		if (!(login.equals("Mercury") && password.equals("Mercury"))) {
			System.out.println("\nEnter a valid Username and Password");
			Bank.isLogged = false;
		} else {
			Bank.isLogged = true;
		}
	}

}
