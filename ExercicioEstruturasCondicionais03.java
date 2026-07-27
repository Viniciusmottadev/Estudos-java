package maratonajava.introducao;
/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O funcionário <nome> pertence ao departamento de código <codigoDepartamento>.

Utilize switch para exibir o departamento correspondente.

1 - Recursos Humanos
2 - Desenvolvimento
3 - Financeiro
4 - Marketing

Caso o código não exista, exiba:

"Departamento inválido."
*/
public class ExercicioEstruturasCondicionais03 {
    public static void main(String[] args) {
    String nomeFunc = "Nicole";
    byte codDepartamento = 4;
        System.out.println("O(a) funcionário(a) "+nomeFunc+" pertence ao departamento de código "+codDepartamento);

        switch (codDepartamento){
            case 1:
                System.out.println("Recursos Humanos");
                break;
            case 2:
                System.out.println("Desenvolvimento");
                break;
            case 3:
                System.out.println("Financeiro");
                break;
            case 4:
                System.out.println("Marketing");
                break;
            default:
                System.out.println("Departamento inválido");
        }
    }
}
