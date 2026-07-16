package maratonajava.introducao;
/*
Prática 2

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O produto <produto> custa R$ <preço>.
Atualmente existem <quantidade> unidades em estoque.
*/
public class Aula03TiposPrimitivosExercicio03 {
    public static void main(String[] args){
       String produto ="Monitor 27pol";
       double precoProduto =1259.90;
       short quantidadeProduto =250;

        System.out.println("O produto "+produto+" custa R$"+precoProduto);
        System.out.println("Atualmente existem "+quantidadeProduto+" unidades em estoque.");
    }
}
