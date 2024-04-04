import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        int ano, mes, dia;
        
        ano = idade / 365;
        idade -= ano * 365;
        mes = idade /30;
        idade -= mes * 30;
        dia = idade;

       	System.out.printf("%d ano(s)%n"
       					+ "%d mes(es)%n" 
       					+ "%d dia(s)%n", ano, mes, dia);
       	
        sc.close();
    }
}
