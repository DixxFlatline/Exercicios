import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int nota1 = 100;
		int nota2 = 50;
		int nota3 = 20;
		int nota4 = 10;
		int nota5 = 5;
		int nota6 = 2;
		int nota7 = 1;
		
		System.out.println(valor);
		
		nota1 = valor/nota1;
		valor %= 100;
		nota2 = valor/nota2;
		valor %= 50;
		nota3 = valor/nota3;
		valor %= 20;
		nota4 = valor/nota4;
		valor %= 10;
		nota5 = valor/nota5;
		valor %= 5;
		nota6 = valor/nota6;
		valor %= 2;
		nota7 = valor/nota7;
		valor %= 1;
		
		System.out.printf("%d nota(s) de R$ 100,00%n"
				+ "%d nota(s) de R$ 50,00%n"
				+ "%d nota(s) de R$ 20,00%n"
				+ "%d nota(s) de R$ 10,00%n"
				+ "%d nota(s) de R$ 5,00%n"
				+ "%d nota(s) de R$ 2,00%n"
				+ "%d nota(s) de R$ 1,00%n",
				nota1, nota2, nota3, nota4, nota5,
				nota6, nota7);
		
		sc.close();
	}
}
