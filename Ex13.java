import java.util.Scanner;
public class Ex13{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número natural:");
        
        int numero = sc.nextInt();
        double soma = 1;

        for (int i= 2; i <= numero; i++) 
        {
            double mult1 = 1, mult2 = 1;

            for (int i2 = 2; i2 <= i; i2++) 
            {
                mult1 *= i2;
                mult2 *= i2 + i2 - 1;
            }

            soma += mult1 / mult2;
        }
        System.out.println("O resuldado desta soma é : " + soma);
    }   
}
