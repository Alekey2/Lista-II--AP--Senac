import java.util.Scanner;
import javax.swing.*;
public class Ex19
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String name = "Joao", senha = "2002",name1,senha1;
	    boolean aceito = false;
	    do
	    {
	        System.out.println("Digite o nome do usuário");
	        name1= sc.nextLine();
	        
	        System.out.println("Digite o Senha do usuário");
	        senha1= sc.nextLine();
	        
	        if(name.equals(name1) && senha.equals(senha1))
	        {
	            System.out.println("Acesso Permitido");
	            aceito = true;
	        }
	            else 
	            System.out.println("Senha inválida");
	       
	    }while (!aceito);
	    
	}   
}
