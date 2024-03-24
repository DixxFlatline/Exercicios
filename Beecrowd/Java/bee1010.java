import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int _cod1 = sc.nextInt(); 
		int _num1 = sc.nextInt(); 
		double _valor1 = sc.nextDouble();
		int _cod2 = sc.nextInt();
		int _num2 = sc.nextInt();
		double _valor2 = sc.nextDouble();
		
		double result = (_num1 * _valor1) + (_num2 * _valor2);
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
		sc.close();

	}
}
