import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Valor é de: ");
	    int i = sc.nextInt();
	    if(i%2==0)
	    for(i=100;i>0;i-=2){
	   
	    System.out.println("Valor é de: " +i);
	    }
	    else{
	    System.out.println("Valor Inválido, Esté valor é Impar!!");
	    }
	    
	}
}

