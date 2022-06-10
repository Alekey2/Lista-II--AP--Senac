import java.util.Scanner;
public class Ex8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cont = 13;
	    int par = 0;
	    int par1= 0;
	    int media=0;
	    int x =1;
	    while(cont<=73){
	    if(cont%2==0){
	    par = cont+par;
	    par1 = cont;
	    System.out.println(x++ +" Os Números pares são: "+par1);
	    }
	    cont= cont+1;
	    }
		media=par/30;
		System.out.println("A soma total dos pares é: "+ par);
		System.out.println("A média Aritmética é: "+media);
		
	}
}
