import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

    public class BancoApp {
        public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private static ClienteServico clienteServico = new ClienteServico();
        public static void main(String[] args) throws IOException {
            boolean x = false;
            Scanner scanner = new Scanner(System.in);
            List<Conta> conta = new ArrayList<>();

            try {
                while (!x) {
                    System.out.println("1. Cadastrar Conta");
                    System.out.println("2. Logar");
                    System.out.print  ("0. Sair         Escolha uma opção: ");

                    int escolha = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer


                    switch (escolha) {
                        case 1:
                            // Cliente cliente = new Cliente(getAgencia(),getNumeroConta(),getSenha());
                            clienteServico.cadastrar();
                            break;
                        case 2:
                            // Cliente login = new Cliente(getAgencia(),getNumeroConta(),getSenha());
                            clienteServico.login();
                            break;
                        case 0:
                            System.out.println("Encerrando o programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }


