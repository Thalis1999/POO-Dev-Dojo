package src.maratonajava.javacore.exercicios.excessoes.dominio;

public class bancoExcessao {
    public static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }

    public static class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public void sacar(double valor) throws SaldoInsuficienteException{
            if (valor > saldo) {
                throw new SaldoInsuficienteException("Nao pode");
            }
            this.saldo -= valor;
            System.out.println("Valor retirado com sucesso");
        }

        public void depositar(double valor) {
            this.saldo += valor;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }

    static void main() throws SaldoInsuficienteException {
        ContaBancaria conta1 = new ContaBancaria(600);

        try{
            System.out.println("Tentando sacar 200 ");
            conta1.sacar(200);
            System.out.println("Tentando 500 agora"); //Erro
            conta1.sacar(500);
        }catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }
    }
}
