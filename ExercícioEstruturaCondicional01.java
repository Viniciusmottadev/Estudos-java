package maratonajava.introducao;
/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O aluno <nome> obteve a nota <nota>.

Resultado:

- Nota maior ou igual a 7 -> "Aluno aprovado."
- Nota entre 5 e 6.9 -> "Aluno em recuperação."
- Nota menor que 5 -> "Aluno reprovado."
*/
public class ExercícioEstruturaCondicional01 {
    public static void main(String[] args) {
        String nomeAluno = "Douglas";
        double notaAluno = 10;
        System.out.println("O aluno "+nomeAluno+" obteve a nota "+notaAluno);

        if (notaAluno >= 7){
            System.out.println("Aluno Aprovado");
        } else if (notaAluno > 5){
            System.out.println("Aluno em recuperação");
        } else if (notaAluno <= 5){
            System.out.println("Aluno reprovado");
        }

    }
}
