import java.util.Scanner;
public class Ex20
{
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
	    float saldo = 0;
	    float sacar = 0;
	    float deposito = 0;
	    int operacao = 0;
	    
	    do{
	        System.out.println("Selecione um número:\n1 Para realizar um Depósito  \n2 Para realizar um Saque \n3 Encerrar ");
	            operacao = sc.nextLine().charAt(0);
	                saldo = 150;
	    switch(operacao){
        case '1':
            System.out.println("Digite o valor do Depósito: ");
            deposito = sc.nextInt();
            saldo = saldo + deposito;
            System.out.println("Seu Saldo é de: "+saldo);
            
        case '2':
              System.out.println("Digite quanto quer Sacar: ");
              sacar = sc.nextInt();
              saldo = saldo;
              saldo = saldo-sacar;
              
        case '3':
            if(saldo==0){
            System.out.println("CONTA ZERADA");
            System.out.println("Seu Saldo é de: "+saldo);
            }
            else if (saldo<0){
                System.out.println("CONTA ESTOURADA");
                System.out.println("Seu Saldo é de: "+saldo);
            }
            else if (saldo>0){
             System.out.println("CONTA PREFERENCIAL");
             System.out.println("Seu Saldo é de: "+saldo);
            }
    
        }
       
	     
	    }while(saldo>1000);

	}
}

