package maratonajava.introducao;
/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O aluno <nome> obteve a nota <nota>.

A nota é maior ou igual a 7? <resultado>
*/
public class ExercicioOperadoresRelacionais01 {
    static public void main(String[] args){
        String nomeAluno = "Marcos";
        double notaAluno = 8.5;
        boolean isOitoPontoCincoMaiorOuIgualSete = 8.5 >= 7;
        System.out.println("O aluno "+nomeAluno+" obteve a nota "+notaAluno);
        System.out.println("A nota é maior ou igual a 7? "+isOitoPontoCincoMaiorOuIgualSete);
    }
}
