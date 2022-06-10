import java.util.Scanner;
public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float num = 1, soma1 = 0, divi = 1;
        
        
        for (float cont = 2; cont <=20; cont++)
        {
            divi = 1 / cont;
            soma1 = soma1 + divi;
            float dfinal = num / cont;
            
            System.out.println(num + " / " + cont + " = " + dfinal );
            
        }
        
        System.out.format("O resultado desta soma é: " + (soma1 + 1));
    }
}