package maratonajava.introducao;
/*
Prática 2

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

O cliente <nome> realizou uma compra de R$ <valor>.

Resultado:

- Compras acima de R$ 500 -> 20% de desconto.
- Compras entre R$ 300 e R$ 500 -> 10% de desconto.
- Compras abaixo de R$ 300 -> Sem desconto.

Mostre:

Valor da compra
Desconto aplicado
Valor final
*/
public class ExercícioEstruturaCondicional02 {
    public static void main(String[] args) {
        String nomeCliente = "Armando";
        double valorCompra = 300;
        System.out.println("O cliente "+nomeCliente+" realizou uma compra de R$ "+valorCompra);

        if (valorCompra >= 500){
            double desconto = valorCompra * 0.20;
            double valorFinal = valorCompra - desconto;
            System.out.println("Valor da compra: R$ "+valorCompra);
            System.out.println("Desconto aplicado 20%");
            System.out.println("Valor final: R$ "+valorFinal);

        } else if (valorCompra >= 300){
            double desconto = valorCompra * 0.10;
            double valorFinal = valorCompra - desconto;
            System.out.println("Valor da compra: R$ "+valorCompra);
            System.out.println("Desconto aplicado 10%");
            System.out.println("Valor final: R$ "+valorFinal);

        } else {
            System.out.println("Valor da compra: R$ "+valorCompra);
            System.out.println("Desconto aplicado 0%");
            System.out.println("Valor final: R$ "+valorCompra);
        }
    }
}
