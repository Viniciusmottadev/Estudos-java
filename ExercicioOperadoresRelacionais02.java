package maratonajava.introducao;
/*
Prática 2

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O funcionário <nome> recebe um salário de R$ <salário>.

O salário é maior que R$ 3000? <resultado>
*/
public class ExercicioOperadoresRelacionais02 {
    static public void main(String[] args){
        String nomeFuncionario = "nicole";
        double salarioFuncionario = 2950;
        boolean isSalarioMaiorQueTresMil = 2950 > 3000;
        System.out.println("A funcionaria "+nomeFuncionario+" recebe um salário de R$ "+salarioFuncionario);
        System.out.println("O salário é maior que R$ 3000? "+isSalarioMaiorQueTresMil);
    }
}

