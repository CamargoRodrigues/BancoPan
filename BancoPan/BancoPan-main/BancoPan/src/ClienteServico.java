import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ClienteServico {
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void cadastrar() throws IOException {
        lista.add(new Cliente(getAgencia(),getNumeroConta(),getSenha()));
    }
    public Cliente getCliente(int agencia, int conta, String senha) throws Exception {
        for (Cliente cliente : lista){
            if(cliente.getAgencia() == agencia && cliente.getNumeroConta() == conta && cliente.getSenha().equals(senha)){
                return cliente;
            }
        }
        throw new Exception("Cliente não encontrado!");
    }

    public void login() throws Exception{
        Cliente cliente = getCliente(getAgencia(),getNumeroConta(),getSenha());
        System.out.println("Saldo:");
        System.out.println("1. Efetuar Depósito:");
        System.out.println("2. Efetuar Saque:");
        System.out.println("3. Efetuar Transferência:");
        System.out.println("0. Sair");
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
