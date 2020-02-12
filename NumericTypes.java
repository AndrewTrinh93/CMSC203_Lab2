import java.util.Scanner;

public class NumericTypes {

	public static void main(String[] args) {
		String user_name;
		final int NUMBER = 2; // number of scores
		double score1 = 0, score2 = 0; // first and second test score
	
		final double BOILING_IN_F = 212;// boiling temperature
		double Ftemperature = 0;  // user's temperature
		double fToC; // temperature in Celsius
		double average = 0; // arithmetic average
		String output;
		double a = 5, b = 9, c = a / b; //5/9 in fomula
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		user_name = input.nextLine();
		System.out.print("Please enter the first test score: ");
		score1 = input.nextInt();
		System.out.print("Please enter the second test score: ");
		score2 = input.nextInt();
	
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
			// Convert Fahrenheit temperatures to Celsius
				fToC = c * (BOILING_IN_F - 32);
				output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
				System.out.println(output);
				
	   System.out.print("Please enter the degrees in Fahrenheit: ");
	   Ftemperature = input.nextDouble();
	   fToC = c * (Ftemperature - 32);
	   output = Ftemperature + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
		input.close();

	}

}
