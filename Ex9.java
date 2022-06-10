import java.util.Scanner;
public class Ex9{

    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos na turma:");
        int aluno1 = 1;
        int alunos2 = sc.nextInt();
        int nota = 0;
        int soma = 0;
        int cont = 0;
        
        while ( aluno1 <= alunos2)
        {
            System.out.println("Digite a nota do " + aluno1 + "° aluno:");
            nota = sc.nextInt();
            aluno1++;
            
            if (nota >= 0 && nota <=10)
            {
                soma = soma + nota;
                cont++;
            }
            else
            {
              System.out.println("Invalido, Tente novamente!");
            }
        }
        
        System.out.println("Na turma que contem " + alunos2 +" alunos a media aritimetica das notas são " + (nota / cont));
   }    
}
