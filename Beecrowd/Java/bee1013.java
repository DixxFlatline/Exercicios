import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		
		int maiorValor = Math.max(A, Math.max(B, C));
				
		System.out.printf("%d eh o maior", maiorValor);
		System.out.println();
		sc.close();

	}
}
