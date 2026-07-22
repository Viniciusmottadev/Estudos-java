package maratonajava.introducao;
/*
Prática 2

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O funcionário <nome> possui <idade> anos.

Se a idade for maior ou igual a 18 anos, imprima:

"Funcionário maior de idade."

Caso contrário, imprima:

"Funcionário menor de idade."
*/
public class ExercicioEstruturasCondicionais02 {
    public static void main(String[] args) {
        String nomeFunc = "Marcelo";
        int idadeFunc = 19;
        System.out.println("O funcionário "+nomeFunc+" possui "+idadeFunc+" anos.");

        if(idadeFunc >= 18) {
            System.out.println("Funcionario maior de idade.");
        }else {
                System.out.println("Funcionário menor de idade.");
            }
    }
}
