import java.util.Scanner;

public class Ex6
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        
        int idade1 = 0;
        String nome1 = ""; 
        String sexo1 = "";

        int conta = 1;
        do 
        {
            System.out.println("Digite o nome do " + conta + "° aluno: ");
            String nome = sc.nextLine();

            System.out.println("Digite o sexo do " + conta + "° aluno [M/F]:");
            String sexo = sc.nextLine();

            System.out.println("Digite a idade do " + conta + "° aluno: ");
            int idade = Integer.parseInt(sc.nextLine());

            if (idade > idade1) 
            {
                idade1 = idade;
                nome1 = nome;
                sexo1 = sexo;
            }
            conta++;
        } while (conta < 6);

        System.out.println("O aluno mais velho da turma: \n" + nome1+ " \nsexo: " + sexo1+ " \n Idade: " + idade1 + " anos");
    }
}   

