import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String funcionario = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble() * 0.15;
		double desconto = salario + vendas;
		
				
		System.out.printf("TOTAL = R$ %.2f%n", desconto);
		sc.close();

	}

}
