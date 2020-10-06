import java.util.Scanner;

public class Bank {

	public static double myBalance = 10000;
	public static boolean isLogged;
	public static boolean isValidEmail;

	static final Scanner sc = new Scanner(System.in);

	public Bank() {

	}

	public Bank(String log, String pas) { // Constructor to create and verify a user

		String login = log;
		String password = pas;

		if (!(login.equals("Mercury") && password.equals("Mercury"))) {
			System.out.println("\n Enter a valid Username and Password");
			isLogged = false;
		} else {
			isLogged = true;
		}

	}

	public static void main(String[] args) {
		// Bank user = new Bank("Mercury", "Mercury"); // logging in with Constructor

		Login l = new Login();
		l.LoginMethod();

		while (isLogged == true) {

			System.out.println("\nChoose your option:");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out
					.println("1 - Deposit    |\t2 - Withdraw   |\t3 - E-transfer  |\t4 - Balance    |\t5 - Logout   |");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter amount you want to deposit : ");
				double amount = sc.nextDouble();
				Deposit d = new Deposit();
				double new_d_Amount = d.DepositMethod(amount);
				System.out.println("Your current balance is $" + new_d_Amount);
				break;

			case 2:
				System.out.print("Enter amount you want to withdraw : ");
				double w_amount = sc.nextDouble();
				Withdraw w = new Withdraw();
				double new_w_Amount = w.WithdrawMethod(w_amount); // new.withdraw(amount)
				System.out.println("Your current balance is $" + new_w_Amount);
				break;
			case 3:
				
				System.out.print("Enter email of recipient : ");
				String e_mail = sc.next();
				Etransfer e = new Etransfer();	
				isValidEmail = e.VerifyEmail(e_mail);				
				System.out.print("Enter amount you want to transfer : ");
				double e_amount = sc.nextDouble();
				double new_e_Amount = e.EtransferMethod(e_mail, e_amount);
				System.out.println("Your current balance is $" + new_e_Amount);
				break;
			case 4:
				Balance b = new Balance();
				b.ShowBalanceMethod();
				break;
			case 5:
				Logout log = new Logout();
				log.LogoutMethod();
				break;

			default:
				System.out.println("Choose a valid option !");
				
			}

		}

	}

}
