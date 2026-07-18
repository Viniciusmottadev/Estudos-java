package maratonajava.introducao;

public class ProgramaHolerite {
    public static void main(String[] args) {
        String nomeFuncionario = "Carlos Henrique";
        String cargoFuncionario = "Desenvolvedor Java júnior";
        double salarioBase = 4850.00;
        int horasExtrasTrabalhadas = 12;
        double valorHoraExtra = 42.50;
        double descontoInss = 0.08;
        double descontoImpostoDeRenda = 0.07;

        double valorTotalHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;
        double salarioBruto = salarioBase + valorTotalHorasExtras;
        double salarioInss = salarioBruto * descontoInss;
        double salarioIr = salarioBruto * descontoImpostoDeRenda;
        double descontoTotal = salarioIr + salarioInss;
        double salarioDescontoTotal = salarioBruto - descontoTotal;

        System.out.println("===Holerite===");
        System.out.println("Funcionário: "+nomeFuncionario);
        System.out.println("Cargo: "+cargoFuncionario);
        System.out.println("Salário Base: R$ "+salarioBase);
        System.out.println("Horas Extras: "+horasExtrasTrabalhadas);
        System.out.println("Valor Hora Extra: "+valorHoraExtra);
        System.out.println("-----------------------");
        System.out.println("Total Horas Extras: R$ "+valorTotalHorasExtras);
        System.out.println("Salário Bruto: R$ "+salarioBruto);
        System.out.println("Desconto INSS: R$ "+salarioInss);
        System.out.println("Desconto Imposto de Renda: R$ "+salarioIr);
        System.out.println("Total do salário após os descontos: R$ "+salarioDescontoTotal);
        System.out.println("=======================================");
    }
}
