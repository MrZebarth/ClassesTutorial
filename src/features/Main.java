package features;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter sides A and B and I'll return side C of a right angle triangle");
		System.out.print("A: ");
		double A=in.nextDouble();
		System.out.print("B: ");
		double B=in.nextDouble();
		double C=Pythagoras.Theorem(A, B);
		System.out.println(A+"^2 + "+B+"^2 = "+C+"^2");
		in.close();
	}

}
