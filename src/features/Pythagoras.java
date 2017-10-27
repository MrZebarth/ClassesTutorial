package features;

public class Pythagoras {

	public static double Theorem(double a, double b) {
		a=Math.pow(a,2);
		b=Math.pow(b, 2);
		Double c=a+b;
		c=Math.sqrt(c);
		return c;
	}
}
