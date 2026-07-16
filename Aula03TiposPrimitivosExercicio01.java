package maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio01 {
    public static void main (String[] args){
        String nome = "Marcos";
        String endereco = "Rua das palmeiras";
        double salario = 8580.90;
        String dataRecebimentoSalario = "16/07/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}

