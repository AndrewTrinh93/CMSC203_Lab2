import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		double a = 4, b = 3, c = a / b;
		double volume = 0;
		String diam;
		double radius = 0;
		String output;
		
		
	System.out.println("Sphere Volume Calculator");
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the diameter: ");
	diam = input.next();
	radius = Double.parseDouble(diam)/ 2;
	volume = c * Math.PI * Math.pow(radius, 3);
	output = "The volume of a sphere is: " + volume;
	System.out.println(output);
	input.close();
	}

}
