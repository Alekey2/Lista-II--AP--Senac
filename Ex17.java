import java.util.Scanner;
public class Ex17
{
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
	    System.out.println("Digite o valor de n para ver seus divisores: ");
	    float n = sc.nextFloat();
	    for(float i =1; i<=n; i++){
	        if(n % i == 0){
	       System.out.println("Os valores dos divisores são: "+i);
	        }
	    }
	}
}

