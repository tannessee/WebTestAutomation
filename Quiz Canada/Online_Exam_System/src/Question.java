
public class Question {

	public String title;
	public String option_a;
	public String option_b;
	public String option_c;
	public String option_d;
	public String correct_option;

	public Question(String q, String a1, String a2, String a3, String a4, String a5) {
		title = q;
		option_a = a1;
		option_b = a2;
		option_c = a3;
		option_d = a4;
		correct_option = a5;

	}

	public void Print() {
		System.out.println(title);
		System.out.println(option_a);
		System.out.println(option_b);
		System.out.println(option_c);
		System.out.println(option_d);
	}


}
