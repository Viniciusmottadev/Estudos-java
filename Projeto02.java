package maratonajava.introducao;

public class Projeto02 {
    public static void main(String[] args) {
        String nomeCliente = "Marcos";
        long numConta = 75638;
        byte agencia = 58;
        String tipoConta = "Poupança";
        double saldoAtual = 12900.90;
        double limiteDisponivel = 4500.00;
        double deposito = 2400.00;
        double saque = 5000.00;
        boolean isClientePossuiCartao = true;
        boolean isContaAtiva = true;
        String categoriaConta;

        System.out.println("====================================");
        System.out.println("            BANCO VISION");
        System.out.println("          SISTEMA BANCÁRIO");
        System.out.println("====================================");
        System.out.println("Cliente........: " + nomeCliente);
        System.out.println("Conta..........: " + numConta);
        System.out.println("Agência........: " + agencia);
        System.out.println("Tipo...........: " + tipoConta);
        System.out.println("Saldo Atual....: R$ " + saldoAtual);
        System.out.println("Limite.........: R$ " + limiteDisponivel);
        System.out.println("Possui Cartão?.. " + isClientePossuiCartao);
        System.out.println("Conta Ativa?.... " + isContaAtiva);
        System.out.println("====================================");

        double saldoAposDeposito = saldoAtual + deposito;

        System.out.println("====================================");
        System.out.println("          OPERAÇÃO: DEPÓSITO");
        System.out.println("====================================");
        System.out.println("Valor depositado.: R$ " + deposito);
        System.out.println("Saldo anterior...: R$ " + saldoAtual);
        System.out.println("Saldo atualizado..: R$ " + saldoAposDeposito);
        System.out.println("====================================");

        double saldoFinal = saldoAposDeposito;
        if (saldoAposDeposito >= saque) {
            saldoFinal = saldoAposDeposito - saque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor do saque...: R$ " + saque);
            System.out.println("Saldo atual......: R$ " + saldoFinal);
        } else {
            double valorFaltante = saque - saldoAposDeposito;
            if (limiteDisponivel >= valorFaltante) {
                double limiteRestante = limiteDisponivel - valorFaltante;
                saldoFinal = 0;
                System.out.println("Saldo insuficiente.");
                System.out.println("O saque foi realizado utilizando o limite.");
                System.out.println("Valor utilizado do limite: R$ " + valorFaltante);
                System.out.println("Limite restante..........: R$ " + limiteRestante);
            } else {
                System.out.println("Saldo e limite insuficientes.");
                System.out.println("Operação de saque cancelada.");
            }
        }
        if (isContaAtiva && isClientePossuiCartao) {
            System.out.println("Conta pronta para utilização.");
        } else {
            System.out.println("Conta bloqueada.");
        }
        switch (tipoConta) {
            case "Corrente":
                System.out.println("Conta corrente.");
                System.out.println("Indicada para movimentações diárias.");
                break;
            case "Poupança":
                System.out.println("Conta poupança.");
                System.out.println("Indicada para investimentos.");
                break;
            case "Salário":
                System.out.println("Conta salário.");
                System.out.println("Indicada para recebimento de salário.");
                break;
            case "Universitária":
                System.out.println("Conta universitária.");
                System.out.println("Indicada para estudantes e movimentações do dia a dia.");
                break;
            case "Empresarial":
                System.out.println("Conta empresarial.");
                System.out.println("Indicada para empresas e movimentações de maior valor.");
                break;
            default:
                System.out.println("Tipo de conta inválido.");
        }
        if (saldoFinal <= 1000) {
            categoriaConta = "Bronze";
        } else if (saldoFinal <= 5000) {
            categoriaConta = "Prata";
        } else if (saldoFinal <= 15000) {
            categoriaConta = "Ouro";
        } else {
            categoriaConta = "Black";
        }
        switch (categoriaConta) {
            case "Bronze":
                System.out.println("Sem benefícios adicionais.");
                break;
            case "Prata":
                System.out.println("Transferências gratuitas.");
                break;
            case "Ouro":
                System.out.println("Transferências gratuitas + Cartão Gold.");
                break;
            case "Black":
                System.out.println("Atendimento exclusivo + Investimentos + Cartão Black.");
                break;
            default:
                System.out.println("Categoria inválida.");
        }
        System.out.println("=======================================");
        System.out.println("           RELATÓRIO DA CONTA");
        System.out.println("=======================================");
        System.out.println("Cliente.............: " + nomeCliente);
        System.out.println("Conta...............: " + numConta);
        System.out.println("Agência.............: " + agencia);
        System.out.println("Tipo................: " + tipoConta);
        System.out.println("Categoria...........: Conta " + categoriaConta);
        System.out.println("Saldo inicial.......: R$ " + saldoAtual);
        System.out.println("Depósito............: R$ " + deposito);
        System.out.println("Saque...............: R$ " + saque);
        System.out.println("Saldo final.........: R$ " + saldoFinal);
        System.out.println("Limite..............: R$ " + limiteDisponivel);
        System.out.println("Status da conta.....: " + isContaAtiva);
        System.out.println("Cartão..............: " + isClientePossuiCartao);
        System.out.println("=======================================");
    }
}