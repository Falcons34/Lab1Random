import java.util.Scanner;
//	Get number input
//	Calculate Degrees Radius Sine Cosine Tangent
public class CircleCal {
	public void run(){
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter a value to begin: ");
		}while(!input.hasNextInt());
		double val = input.nextDouble();
		double rad = Radians(val);
		double sine = Sine(val);
		double cosine = Cosine(val);
		double tan = Tangent(val);
		System.out.println("Degrees Radians Sine Cosine Tangent");
		System.out.printf(" %5.0f  %5.4f  %5.4f  %5.4f  %5.4f%n",val,rad,sine,cosine,tan);
	}
	private double Radians(double input){
		return Math.toRadians(input);
	}
	private double Sine(double input){
		return Math.sin(input);
	}
	private double Cosine(double input){
		return Math.cos(input);
	}
	private double Tangent(double input){
		return Math.tan(input);
	}
}
