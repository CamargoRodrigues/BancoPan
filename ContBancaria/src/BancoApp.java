import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BancoApp {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Fazer Logir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");



            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    try {
                        System.out.println("Informe o nome: ");
                        String nomeCliente = reader.readLine();

                        System.out.println("Informe o CPF: ");
                        String cpfCliente = reader.readLine();

                        String agencia = String.valueOf(22);

                        Random random = new Random();
                        String numeroConta = String.valueOf(random.nextInt(10000));

                        System.out.println("Informe a senha: ");
                        String senha = reader.readLine();

                        // Criar e cadastrar a conta corrente
                        Conta conta = new Conta(nomeCliente,cpfCliente,agencia,numeroConta,senha);
                        contas.add(conta);

                        System.out.println("Conta cadastrada com sucesso!");

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Informe o CPF do cliente: ");
                        String cpfCliente = reader.readLine();

                        String clienteEncontrado = null;
                        for (Conta cc : contas) {
                            if (cc.getCpf().equals(cpfCliente)) {
                                clienteEncontrado = cc.getCpf();
                            }
                        }

                        if (clienteEncontrado == null) {
                            System.out.println("Conta não encontrada. Cadastre uma conta primeiro.");
                        } else {
                            try {
                                System.out.println("Informe a senha de 4 dígitos: ");
                                String senha = reader.readLine();

                                for (Conta cc : contas) {
                                    if (cc.getSenha().equals(senha)) {

                                        Conta conta = new Conta(cc.getCpf(), cc.getSenha());

                                        while (true){

                                            System.out.println("1. Efetuar Depósito");
                                            System.out.println("2. Efetuar Saque");
                                            System.out.println("3. Efetuar Transferência");
                                            System.out.println("0. Sair");
                                            System.out.print("Escolha uma opção: ");
                                            escolha = scanner.nextInt();



                                            switch (escolha){
                                                case 1:
                                                    System.out.print("Informe o Valor R$:");
                                                    conta.depositar(reader.read());
                                                    System.out.println("Operação Realizada com Sucesso!");
                                                    break;
                                                case 2:
                                                    System.out.print("Informe o Valor R$:");
                                                    conta.sacar(reader.read());
                                                    System.out.println("Operação Realizada com Sucesso!");
                                                    break;
                                                case 3:
                                                    System.out.print("Informe o Valor R$:");
                                                    conta.transferir(reader.read(),reader.read(), reader.readLine());
                                                    System.out.println("Operação Realizada com Sucesso!");
                                                    break;
                                                case 0:
                                                    System.out.println("Encerrando o programa...");
                                                    System.exit(0);
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida. Escolha uma opção válida.");
                                            }

                                        }

                                    }
                                }
                                System.out.println("Senha incorreta. Tente novamente.");
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}
