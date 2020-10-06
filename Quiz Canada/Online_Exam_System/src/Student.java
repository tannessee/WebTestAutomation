import java.util.Scanner;
public class Student {

	static final Scanner sc = new Scanner(System.in);

	public String Name;
	public int StudentId;
	public String Address;
	public String PhoneN;
	public String Email;

	public void CreateSt() {

		System.out.println("Enter Student's info :        |");
		System.out.println("-------------------------------");
		System.out.print("Name : \t");
		Name = sc.next();

		boolean isInt = true;
		do {
			System.out.print("Student ID (numeric) : \t");
			String StId = sc.next();
			try {
				StudentId = Integer.parseInt(StId);
				isInt = true;
			} catch (NumberFormatException ex) {
				System.out.print("Student ID field consists only from numbers!\n");
				isInt = false;
			}
		} while (!isInt);

		System.out.print("Address : \t");
		Address = sc.next();
		System.out.print("Phone number : \t");
		PhoneN = sc.next();
		System.out.print("Email : \t");
		Email = sc.next();
		System.out.println("-------------------------------");
	}

}
