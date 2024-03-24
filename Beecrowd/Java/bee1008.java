import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int _funcionario = sc.nextInt();
		double _horas = sc.nextDouble();
		double _salario = sc.nextDouble();
		
				
		System.out.printf("NUMBER = %d%n", _funcionario);
		System.out.printf("SALARY = U$ %.2f%n", _horas * _salario);
		sc.close();

	}

}
