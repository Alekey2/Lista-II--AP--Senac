import java.util.Scanner;
public class Ex2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o Valor de N: ");
	    int N = sc.nextInt();
		int i = 1;
		int soma = 0;
		
        while(N>=i){
        System.out.println("Valor de i  \n" +i);
        soma = i+soma;
        i++;
        }
        System.out .println("O Resultado obtido de todos as somas é de : " +soma);
	}
}



