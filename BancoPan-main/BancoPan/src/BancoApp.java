import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

    public class BancoApp {
        public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException {
            boolean x = false;
            Scanner scanner = new Scanner(System.in);
            List<Cliente> clientes = new ArrayList<>();
            List<Conta> conta = new ArrayList<>();

        while (!x) {
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Logar Conta");
            System.out.print  ("0. Sair         Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer


            switch (escolha) {
                case 1:
                    // Implementar a lógica para cadastrar um cliente
                case 2:
                    Cliente cliente = new Cliente(getAgencia(),getNumeroConta(),getSenha());
                    System.out.println("1. Efetuar Depósito");
                    System.out.println("2. Efetuar Saque");
                    System.out.println("3. Efetuar Transferência");
                    break;
                case 3:
                    // Implementar a lógica para cadastrar uma conta poupança

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

        public static int getAgencia() throws IOException {
            System.out.println("Número da Agencia:");
            return Integer.parseInt(reader.readLine());
        }
        public static int getNumeroConta() throws IOException {
            System.out.println("Número da Conta:");
            return Integer.parseInt(reader.readLine());
        }
        public static String getSenha() throws IOException {
            System.out.println("Senha:");
            return reader.readLine();
        }
    }


