import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		System.out.printf("%.3f km/l%n", X / Y);
		
		sc.close();
	}
}
