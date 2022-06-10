import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite um número natural: ");
        
        
        float soma = 1;
        float ent = sc.nextInt();
        
        for(float i = 1; i <= ent; i++)
        {
          soma += ((2*i) / (2 * i + 1));
          System.out.println((2*i) +" / "+ (2*i+1) + " igual a " + (2*i) / (2*i+1));
          
        }
        System.out.println("O resultado desta soma é: " + soma);
    }
        
}
