import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

    public class BancoApp {
        public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<ContaCorrente> contasCorrentes = new ArrayList<>();
            List<ContaPoupanca> contasPoupanca = new ArrayList<>();
            List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar Cliente Pessoa Física");
            System.out.println("2. Cadastrar Conta Corrente");
            System.out.println("3. Cadastrar Conta Poupança");
            System.out.println("4. Efetuar Depósito");
            System.out.println("5. Efetuar Saque");
            System.out.println("6. Efetuar Transferência");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    // Implementar a lógica para cadastrar um cliente
                case 2:
                    // Implementar a lógica para cadastrar uma conta corrente
                    break;
                case 3:
                    // Implementar a lógica para cadastrar uma conta poupança
                    break;
                case 4:
                    // Implementar a lógica para efetuar um depósito
                    break;
                case 5:
                    // Implementar a lógica para efetuar um saque
                    break;
                case 6:
                    // Implementar a lógica para efetuar uma transferência
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


