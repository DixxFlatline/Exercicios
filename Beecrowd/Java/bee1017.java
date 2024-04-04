import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double horas = sc.nextDouble();
		double velocidade = sc.nextDouble();
		
		double result = horas * velocidade / 12;
		
		System.out.printf("%.3f%n", result);
		
		sc.close();
	}
}
