package maratonajava.introducao;
/*
Prática 3

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O produto <produto> possui <quantidade> unidades em estoque.

A quantidade é igual a 100? <resultado>

A quantidade é diferente de 100? <resultado>
*/
public class ExercicioOperadoresRelacionais03 {
    static public void main(String[] args){
        String nomeProduto = "Detergente";
        int quantidadeProduto = 200;
        boolean isQuantidadeIgualCem = 200 == 100;
        boolean isQuantidadeDiferenteDeCem = 200 != 100;
        System.out.println("O produto "+nomeProduto+" possui "+quantidadeProduto+" unidades em estoque.");
        System.out.println("A quantidade é igual a 100? "+isQuantidadeIgualCem);
        System.out.println("A quantidade é diferente de 100? "+isQuantidadeDiferenteDeCem);
    }
}
