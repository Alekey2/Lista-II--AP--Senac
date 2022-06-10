import java.util.Scanner;
public class Ex1
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Digite o valor de i: ");
	   int i = sc.nextInt();
	   while(i<50){
	       i = i+1;
	       System.out.println("Inteiro + " + i);
	   }
	   
	}
}
