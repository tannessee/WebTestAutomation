public class Etransfer {

	public boolean VerifyEmail(String email) {

		String regex = "^[A-Za-z0-9+_.-]+@yandex.ru$";
		if (email.matches(regex)) {
			return true;
		}
		return false;

	}

	public double EtransferMethod(String email, double a) {

		if (Bank.isValidEmail == true) {
			if (a <= 3000 && a <= Bank.myBalance) {
				return Bank.myBalance -= a;
			} else {
				System.out.println(
						"You cannot transfer more than $3000 at one time or transfer amount more then your balance");
				return Bank.myBalance;
			}

		} else {
			System.out.println("You can transfer only to @yandex.ru clients");
			return Bank.myBalance;
		}

	}

}
