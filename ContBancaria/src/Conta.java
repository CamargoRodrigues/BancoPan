
public class Conta extends Cliente {
    private String agencia;
    private String numeroConta;
    protected String senha;
    private float saldo;

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", senha='" + senha + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public Conta(String nome, String cpf) {
        super(nome, cpf);
    }

    public Conta(String nome, String cpf, String agencia, String numeroConta, String senha) {
        super(nome, cpf);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Saldo insuviciente.");
        } else {
            saldo -= valor;
        }
    }

    public void transferir(int destino, double valor, String senha) {
        if (saldo >= valor && this.senha.equals(senha)) {
            saldo -= valor;
        }
    }
}
