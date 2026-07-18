package maratonajava.introducao;
/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O funcionário <nome> recebe R$ <salário>.
Após receber um aumento de R$ <aumento>,
seu novo salário é R$ <novo salário>.
*/
public class Aula04OperadoresExercicio01 {
    public static void main(String[] args) {
        String nomeFuncionario = "Cleiton";
        double salarioFuncionario = 3500;
        double aumentoSalario = 650;
        double novoSalario = salarioFuncionario + aumentoSalario;

        System.out.println("O funcionário "+nomeFuncionario+" recebe R$ "+salarioFuncionario);
        System.out.println("Após receber um aumento de R$ "+aumentoSalario);
        System.out.println("seu novo salário é de R$ "+novoSalario);
    }
}
