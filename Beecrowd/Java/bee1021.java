import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble();
        int valorInteiro = (int) valor;
        int centavos = (int) ((valor - valorInteiro) * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");

        for (int nota : notas) {
            int quantidade = valorInteiro / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota / 1.0);
            valorInteiro %= nota;
        }

        System.out.println("MOEDAS:");

        for(int moeda : moedas) {
            int quantidade = centavos / moeda;
            if (moeda == 100) {
                quantidade += valorInteiro;
            }
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            centavos %= moeda;
        }
        
        sc.close();
    }
}
