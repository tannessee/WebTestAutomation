
public class Withdraw {

	public double WithdrawMethod(double a) {
		if (a <= 2000 && a <= Bank.myBalance) {
			return Bank.myBalance -= a;
		} else {
			System.out.println(
					"You cannot withdraw more than $2000 at one time or withdraw amount more then your balance");
			return Bank.myBalance;
		}
	}
}
