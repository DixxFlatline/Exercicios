import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		hora = N / 3600;
		N -= hora * 3600;
		minuto = N / 60;
		N -= minuto * 60;
		segundo = N;
		
		System.out.printf("%d:%d:%d%n", hora, minuto, segundo);
		
		sc.close();
	}
}
