import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número maior que zero e veja seu fatorial:");
                
        int num = sc.nextInt();
        long fatorial = 1;
        
        for (int i = 1; i <= num; i++) 
        {
            fatorial *= i;
        }
           
        
        System.out.println("O fatorial deste número "+ num + " é " + fatorial);
    }
}