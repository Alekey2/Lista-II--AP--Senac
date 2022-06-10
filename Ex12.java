import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número natural: ");
        
        float x = 0;
        float soma = 0;
        
        for(float entrada = sc.nextInt(); entrada > 0; entrada--)
        {
            soma = soma + (x / entrada);
            x++;
            
            System.out.println(x + " / " + entrada + " = " + (x / entrada));
            
        }
        System.out.println("O resultado desta soma é: " + soma);
    }
    
}