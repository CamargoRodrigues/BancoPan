public class ContaPoupanca {
    public static class contaPoupanca extends Conta {
        private Cliente cliente;
        private double saldo;

        public contaPoupanca(String agencia, String numeroConta, String senha) {
            super(agencia, numeroConta, senha);
        }

        // construtor, getters e setters
        @Override
        public void depositar(double valor) {
            saldo += valor;
        }

        @Override
        public boolean sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                return true;
            }
            return false;
        }

        @Override
        public boolean transferir(Conta destino, double valor, String senha) {
            if (saldo >= valor && this.senha.equals(senha)) {
                saldo -= valor;
                destino.depositar(valor);
                return true;
            }
            return false;
        }
    }

}
