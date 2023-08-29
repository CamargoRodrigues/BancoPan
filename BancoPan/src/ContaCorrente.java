public class ContaCorrente {
    public static class contaCorrente extends Conta {
        private Cliente cliente;
        private double saldo;
        private contaCorrente(String agencia, String numeroConta, String senha) {
            super(agencia, numeroConta, senha);
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
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
