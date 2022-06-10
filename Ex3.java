import java.util.Scanner;
public class Ex3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = 0;
	    int maior = 0;
		
		for(int i = 1; i<=10; i++){
			System.out.print("Digite o " +(i)+ "º Valor:\n");
			num= sc.nextInt();
			if(num > maior){
			maior = num;
			}
			}
		
		System.out.println("O Maior Valor Entre Os 10 números é: "+ maior);
		
	}
}