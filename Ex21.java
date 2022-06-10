import java.util.Scanner;
public class Ex21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        int n1 = 1;
        int soma = 0;
        
        while (n1 < n)
        {
            if(n % n1 == 0)
            {
                soma += n1;
            }
            n1++;
        }
        if (n == soma)
        {
            System.out.println("O número " + n + " é um número perfeito!");
        }
        else
        {
            System.out.println("O número " + n + " não é um número perfeito!");
        }
    }
}