import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner reader = new Scanner(System.in);
        Emprestimo[] emprestimos = null;
        int qttdEmprestimos = 0;
        int option = 0;
        int option2 = 0;
        int stopCondition = 0;
        int counter = 0;
        System.out.println("Digite a quantidade de emprestimos que deseja fazer: ");
        qttdEmprestimos = reader.nextInt();
        reader.nextLine();
        emprestimos = new Emprestimo[qttdEmprestimos];
        do {
            System.out.println("-------------------------------");
            System.out.println(
                    "Digite uma opção:\n1 - Cadastrar emprestimo;\n2 - Imprimir um emprestimo;\n3 - Imprimir todos emprestimos cadastrados;");
            option = reader.nextInt();
            reader.nextLine();
            switch (option) {
                case 1: {
                    if (counter < qttdEmprestimos) {
                        Emprestimo objeto = new Emprestimo();
                        System.out.println("Digite a data do emprestimo:");
                        objeto.data = reader.next();
                        System.out.println("Digite o nome do cliente: ");
                        objeto.cliente = reader.next();
                        reader.nextLine();
                        int controller = 0;
                        do {
                            stopCondition = controller;
                            System.out.println("Digite o tipo de midia: ");
                            String tipo = reader.nextLine();
                            System.out.println("Digite a descricao da midia: ");
                            String descricao = reader.nextLine();
                            System.out.println("Digite o valor da midia: ");
                            float valor = reader.nextFloat();
                            reader.nextLine();
                            Midia midia = new Midia(tipo, descricao, valor);
                            objeto.midias[stopCondition] = midia;
                            objeto.midias[stopCondition].alterarStatus();
                            objeto.midias[stopCondition].retornaDados();
                            controller++;
                            System.out.println("Deseja cadastrar mais uma midia?\n1 - Sim;\n2 - Nao;");
                            option2 = reader.nextInt();
                            reader.nextLine();
                            if (stopCondition == 5) {
                                System.out.println("Não e possivel registrar mais midias!");
                            }
                        } while (option2 != 2 && stopCondition < 5);
                        emprestimos[counter] = objeto;
                        counter++;
                    } else {
                        System.out.println("Emprestimos cadastrados: " + counter + " de " + qttdEmprestimos);
                        System.out.println("Não existem mais emprestimos a serem cadastrados!");
                    }
                }
                    break;
                case 2: {
                    System.out.println("Digite o numero do emprestimo que deseja imprimir:");
                    for (int i = 0; i < emprestimos.length; i++) {
                        System.out.print((i + 1) + " | ");
                    }
                    System.out.print("\n");
                    option = reader.nextInt();
                    if (emprestimos[option - 1] != null) {
                        emprestimos[option - 1].impressaoDados();
                    } else {
                        System.out.println("Emprestimo nao cadastrado!");
                    }
                }
                    break;
                case 3:
                    for (Emprestimo emprestimo : emprestimos) {
                        if (emprestimo != null) {
                            emprestimo.impressaoDados();
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (option != 0);

    }
}
