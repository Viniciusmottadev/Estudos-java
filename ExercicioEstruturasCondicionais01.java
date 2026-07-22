package maratonajava.introducao;
/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O aluno <nome> obteve a nota <nota>.

Se a nota for maior ou igual a 7, imprima:

"Aluno aprovado."

Caso contrário, imprima:

"Aluno reprovado."
*/
public class ExercicioEstruturasCondicionais01 {
    public static void main(String[] args) {
        String nomeAluno = "Cleiton";
        int notaAluno = 6;
        if(notaAluno >= 7) {
            System.out.println("O aluno "+nomeAluno+" foi aprovado.");
        }else {
            System.out.println("O aluno "+nomeAluno+" foi reprovado.");
        }

    }
}
