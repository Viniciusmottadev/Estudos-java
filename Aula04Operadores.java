package maratonajava.introducao;

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
    }
}
