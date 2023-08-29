public abstract class Conta extends Cliente {
    private String agencia;
    private String numeroConta;
    protected String senha;

    public Conta(String nome, String cpf) {
        super(nome, cpf);
    }

    public abstract void depositar(double valor);

    public abstract boolean sacar(double valor);

    public abstract boolean transferir(Conta destino, double valor, String senha);

    public Conta(String agencia, String numeroConta, String senha) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.senha = senha;
    }


}
