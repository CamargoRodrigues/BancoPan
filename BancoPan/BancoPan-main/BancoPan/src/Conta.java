    public class Conta extends Cliente {
        private Cliente cliente;
        private double saldo;

        public Conta(int agencia, int numeroConta, String senha) {
            super(agencia, numeroConta, senha);
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public boolean sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                return true;
            }
            return false;
        }

        public boolean transferir(Conta destino, double valor, String senha) {
            if (saldo >= valor && this.senha.equals(senha)) {
                saldo -= valor;
                destino.depositar(valor);
                return true;
            }
            return false;
        }
    }

