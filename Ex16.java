import java.util.Scanner;
public class Ex16
{
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
	    int n = 0;
	    
	    do{
	     System.out.println("Digite o valor de n: ");
	     n = sc.nextInt();
	     
	    if(n%2==0 && n>0){
	    System.out.println("Este valor é Par");
	    System.out.println("Este valor é Postivo");
	    }
	    
	    else if (n%2==0 && n<0){
	    System.out.println("Este valor é Par");
	    System.out.println("Este valor é Negativo");
	    }
	    
	    else if(n%2==1 && n>0){
	    System.out.println("Este valor é Impar");
	    System.out.println("Este valor é Postivo");
	    }
	    
	    else if (n%2==-1 && n<0){
	    System.out.println("Este valor é Impar");
	    System.out.println("Este valor é Negativo");
	    }
	    
	    else
	    System.out.println("Este valor é Nulo");
	     break;
	    }while(n>=n);

	}
}

