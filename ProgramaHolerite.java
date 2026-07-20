package desafios;

public class ProgramaHolerite {
    public static void main(String[] args) {
        //informações funcionario
        String nomeFuncionario = "Carlos Henrique";
        String cargoFuncionario = "Desenvolvedor Java júnior";
        String departamentoFuncionario = "Tecnologia";
        long matriculaFuncionario = 2026001;
        //beneficios
        double valeAlimentação = 650.00;
        double valeTransporte = 320.00;
        double bonus = 500.00;
        double salarioBase = 4850.00;
        int horasExtrasTrabalhadas = 12;
        double valorHoraExtra = 42.50;
        double descontoInss = 0.08;
        double descontoImpostoDeRenda = 0.07;
        //contas
        double valorTotalHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;
        double salarioBruto = salarioBase + valorTotalHorasExtras;
        //impostos
        double salarioInss = salarioBruto * descontoInss;
        double salarioIr = salarioBruto * descontoImpostoDeRenda;
        double descontoTotal = salarioIr + salarioInss;
        double salarioLiquido = salarioBruto - descontoTotal;
        //soma beneficios
        double totalBeneficios = valeAlimentação + valeTransporte + bonus;

        //tela
        System.out.println("====Holerite====");
        System.out.println("Matrícula.....: "+matriculaFuncionario);
        System.out.println("Funcionário.....: "+nomeFuncionario);
        System.out.println("Cargo.....: "+cargoFuncionario);
        System.out.println("Departamento.....: "+departamentoFuncionario);
        System.out.println("------------------------------------");
        System.out.println("Salário Base.....: R$ "+salarioBase);
        System.out.println("Horas Extras.....: "+horasExtrasTrabalhadas);
        System.out.println("Valor Hora Extra.....: "+valorHoraExtra);
        System.out.println("Total Horas Extras.....: R$ "+valorTotalHorasExtras);
        System.out.println("------------------------------------");
        System.out.println("Vale alimentação.....: R$ "+valeAlimentação);
        System.out.println("Vale transporte.....: R$ "+valeTransporte);
        System.out.println("Bônus de participação.....: R$ "+bonus);
        System.out.println("Total Benefícios.....: R$ "+totalBeneficios);
        System.out.println("------------------------------------");
        System.out.println("Salário Bruto.....: R$ "+salarioBruto);
        System.out.println("Desconto INSS.....: R$ "+salarioInss);
        System.out.println("Desconto Imposto de Renda.....: R$ "+salarioIr);
        System.out.println("Total Descontos.....: R$ "+descontoTotal);
        System.out.println("------------------------------------");
        System.out.println("Salário Líquido.....: R$ "+salarioLiquido);
        System.out.println("=======================================");
    }
}
