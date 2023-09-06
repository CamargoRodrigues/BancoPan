import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServico {
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




    Scanner scanner = new Scanner(System.in);

    public void cadastrar() throws IOException {
        lista.add(new Conta(getAgencia(),getNumeroConta(),getSenha()));
    }
    public Conta getCliente(int agencia, int conta, String senha) throws Exception {
        for (Cliente cliente : lista){
            if(cliente.getAgencia() == agencia && cliente.getNumeroConta() == conta && cliente.getSenha().equals(senha)){

                Conta contaCliente = new Conta(cliente.getAgencia(), cliente.getNumeroConta(), cliente.getSenha());

                boolean y = false;
                int x;

                while (!y) {
                    System.out.println("Saldo: " + contaCliente.getSaldo());
                    System.out.println("1. Efetuar Depósito:");
                    System.out.println("2. Efetuar Saque:");
                    System.out.println("3. Efetuar Transferência:");
                    System.out.println("0. Sair");
                    x = scanner.nextInt();

                    switch (x) {
                        case 1:
                            contaCliente.depositar(reader.read());
                        case 2:
                        case 3:
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Erro");
                    }
                }
            }
        }
        throw new Exception("Cliente não encontrado!");
    }

    public void login() throws Exception{
        Cliente cliente = getCliente(getAgencia(),getNumeroConta(),getSenha());

    }
    private int getAgencia() throws IOException {
        System.out.println("Número da Agencia:");
        return Integer.parseInt(reader.readLine());
    }
    private int getNumeroConta() throws IOException {
        System.out.println("Número da Conta:");
        return Integer.parseInt(reader.readLine());
    }
    private String getSenha() throws IOException {
        System.out.println("Senha:");
        return reader.readLine();
    }
}
