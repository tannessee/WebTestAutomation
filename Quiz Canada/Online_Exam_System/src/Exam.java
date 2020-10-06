import java.util.Scanner;

public class Exam {

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int CorrectAn = 0;
		int WrongAn = 0;
		double FinalScore;
		int num = 10;

		Student stud = new Student();
		stud.CreateSt();

		Question questions[] = new Question[num];
		System.out.println("\n\t Exam begins. Choose a correct option: ");
		questions[0] = new Question("\n1. Canada's Birthday is on:", "a. June 1st", "b. July 1st", "c. July 11th",
				"d. June 10th", "b");
		questions[1] = new Question("\n2. The capital city of Canada is:", "a. Montreal", "b. Vancouver", "c. Ottawa",
				"d. Toronto", "c");
		questions[2] = new Question("\n3. Canada has _____ provinces:", "a. 7", "b. 8", "c. 9", "d. 10", "d");
		questions[3] = new Question("\n4. Canada became a country in:", "a. 1467", "b. 1667", "c. 1867", "d. 1877", "c");
		questions[4] = new Question("\n5. The name of the royal anthem of Canada is:", "a. Oh Canada", "b. God Save the Queen", 
				"c. Bud the Spud", "d. Vive le Canada", "a");
		questions[5] = new Question("\n6. The current prime minister of Canada is", "a. Pierre Trudeau", "b. Justin Trudeau ", 
				"c. Wayne Gretzky", "d. Stephen Harper", "b");
		questions[6] = new Question("\n7. Canada's head of state is:", "a. Governor General of Canada", "b. Her Majesty Queen Elizabeth II",
				"c. Prime Minister", "d. Lieutenant Governor", "b");
		questions[7] = new Question("\n8. Canada is famous for:", "a. Niagara Falls ", "b. Victoria Falls", "c. Yosemite Falls",
				"d. Iguazu Falls", "a");
		questions[8] = new Question("\n9. Canada touches ______ oceans:", "a. one", "b. two", "c. three", "d. four", "c");
		questions[9] = new Question("\n10. The St. Lawrence River is a huge river in:", "a. Ontario", "b. Quebec", "c. New Brunswick",
				"d. Manitoba", "b");

		for (int i = 0; i < num; i++) {
			questions[i].Print();
			System.out.print("Your answer is : ");
			String answer = sc.next();
					
			if (answer.toLowerCase().equals(questions[i].correct_option)) {
				CorrectAn++;
			} else
				WrongAn++;
		}

		System.out.println("----------------------------------------");
		System.out.println("Student :  \t" + stud.Name );
		System.out.println("Student ID : \t" + stud.StudentId);
		System.out.println(stud.Name + " got " + CorrectAn +" correct answer(s)");
		System.out.println(stud.Name + " got " + WrongAn +" wrong answer(s)");
		FinalScore = CorrectAn * 100 / num;
		System.out.println(stud.Name+ "'s final score is " + FinalScore + " %");
		System.out.println("----------------------------------------");
		
		if (FinalScore >=60.0) {
			System.out.println("Congrats! You Passed the exam! ");
			} else System.out.println("Sorry! You Failed the exam! ");

	}

}
