import java.util.Scanner;
public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número natural:");
        float Inicio = 2;
        float Entrada = sc.nextFloat();
        float soma = 1;
        
        while (Inicio <= Entrada)
        {
            if ( Inicio % 2 == 0)
            {
                soma = soma - ( 1 / Inicio);
            }
            else
            {
                soma = soma + (1 / Inicio);
            }
            Inicio++;
            System.out.format("\n%.2f", soma);
        }
        
        
        System.out.format("\nO resultado da soma é : %.2f", soma);
            
    }
}
