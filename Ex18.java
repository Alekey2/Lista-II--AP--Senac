import java.util.Scanner;
public class Ex18 {
    
	public static void main(String[] args) {
	   
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor de f: ");
	    int n = 1;
	    int n1 = 0;
	    int f = sc.nextInt();
	    for(int i=0 ;i<f;i++){
	       
	            System.out.println(n);
	            int n2 = n;
	            n = n+n1;
	            n1 = n2;
	        }
	    }
}


