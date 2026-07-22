package maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
         int numero01 = 10;
         int numero02 = 20;
        double numero001 = 10;
        double numero002 = 20;
        int resultadosoma= numero01 + numero02;
        int resultadosub = numero02 - numero01;
        int resultadodiv = numero02 / numero01; //a divisão de inteiros tem q dar um número inteiro.
        int resultadomulti = numero01 * numero02;
        double resultadodivdouble = numero002 / numero001; //a divisão usando double possibilita a divisão assim tornando conjunto real.
        System.out.println("Valor int "+resultadosoma);
        System.out.println("Valor int "+resultadosub);
        System.out.println("Valor int "+resultadodiv);
        System.out.println("Valor int "+resultadomulti);
        System.out.println("Valor real "+resultadodivdouble);
        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != sempre vão retornar valores em boolean
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezMenorOuIgualVinte = 10 <= 20;
        boolean isDezMaiorOuIgualVinte = 10 >= 20;
        System.out.println("Dez é maior que Vinte? "+isDezMaiorQueVinte);
        System.out.println("Dez é menor que Vinte? "+isDezMenorQueVinte);
        System.out.println("Dez é igual a Vinte? "+isDezIgualVinte);
        System.out.println("Dez é igual a Dez? "+isDezIgualDez);
        System.out.println("Dez é diferente de Vinte? "+isDezDiferenteDeVinte);
        System.out.println("Dez é menor ou igual a Vinte? "+isDezMenorOuIgualVinte);
        System.out.println("Dez é maior ou igual a vinte? "+isDezMaiorOuIgualVinte);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //2800
        bonus /= 2; //1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
