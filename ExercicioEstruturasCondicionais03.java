package maratonajava.introducao;
/*
Prática 3

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O produto <produto> possui <quantidade> unidades em estoque.

Se a quantidade for maior que 0, imprima:

"Produto disponível."

Caso contrário, imprima:

"Produto indisponível."
*/
public class ExercicioEstruturasCondicionais03 {
    public static void main(String[] args) {
        String nomeProduto = "Sabonete ";
        int quantidadeProduto = 267;
        System.out.println("O produto "+nomeProduto+" possui "+quantidadeProduto+" unidades em estoque.");

        if(quantidadeProduto > 0){
            System.out.println("Produto disponível.");
        }else {
            System.out.println("Produto indisponível.");
        }
    }
}
