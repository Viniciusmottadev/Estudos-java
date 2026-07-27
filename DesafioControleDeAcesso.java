package maratonajava.introducao;

public class DesafioControleDeAcesso {
    public static void main(String[] args) {
        String nomeFunc = "Maicon";
        String cargoFunc = "Desenvolvedor Delphi";
        String departamentoFunc = "Desenvolvimento";
        int idadeFunc = 23;
        boolean isFuncTemCracha = (true);
        int tempoDeEmpresa = 38;
        boolean isFuncPossuiTreinamento = (true);

        System.out.println("==========================================================");
        System.out.println("     Tech Solutions");
        System.out.println("     Sistema De Controle De Acesso");
        System.out.println("==========================================================");
        System.out.println("Funcionário...: "+nomeFunc);
        System.out.println("Cargo...: "+cargoFunc);
        System.out.println("Departamento...: "+departamentoFunc);
        System.out.println("Idade...: "+idadeFunc);
        System.out.println("Tempo de empresa...: "+tempoDeEmpresa);
        System.out.println("Possui crachá? "+isFuncTemCracha);
        System.out.println("Possui treinamento? "+isFuncPossuiTreinamento);
        System.out.println("----------------------------------------------------------");
        System.out.println("REGRAS");
        System.out.println("O funcionário somente poderá entrar se:");
        System.out.println("- Possuir 18 anos ou mais.\n - Possuir crachá\n - Possuir treinamento de segurança\n - Possuir pelo menos 6  meses de empresa\n");
        System.out.println("==========================================================");
        System.out.println("Resultado da análise: ");

        if (idadeFunc >= 18){
            System.out.println("Acesso liberado\nFuncionário tem 18 ou mais anos.");
            } else {
            System.out.println("ACESSO NEGADO\nFuncionário menor de idade.");
                } if (isFuncTemCracha){
                    System.out.println("Acesso liberado\nFuncionário possui crachá.");
                    } else {
                        System.out.println("ACESSO NEGADO\nFuncionário não possui crachá.");
                        } if (isFuncPossuiTreinamento){
                            System.out.println("Acesso liberado\nFuncionário tem treinamento.");
                            } else {
                                System.out.println("ACESSO NEGADO\nFuncionário não tem treinamento.");
                                } if (tempoDeEmpresa >= 6){
                                    System.out.println("Acesso liberado\nFuncionário tem 6 ou mais meses de empresa.");
                                    } else {
                                        System.out.println("ACESSO NEGADO\nFuncionário não tem 6 meses de empresa.");
                                        }
    }
}
