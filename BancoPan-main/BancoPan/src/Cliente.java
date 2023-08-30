public class Cliente {
    private String nome;
    private String cpf;
    private int agencia;
    private int numeroConta;
    protected String senha;

    public Cliente(int agencia, int numeroConta, String senha) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.senha = senha;
    }

}
