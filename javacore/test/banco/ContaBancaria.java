package javacore.test.banco;

public class ContaBancaria {
    private double limiteChequeEspecial = 0;
    private double saldo;
    private boolean chequeEspecial;
    private boolean boletoPago;

    public ContaBancaria(double saldo) {
        if (saldo <= 500){
            limiteChequeEspecial = 50;
        } else if (saldo > 500){
            limiteChequeEspecial = saldo * 0.50;
        } else if (saldo > 500){
            limiteChequeEspecial = saldo * 0.50;
        }

        this.saldo = saldo;
        this.chequeEspecial = false;
        this.boletoPago = false;
    }
    public String status() {
        return "ContaBancaria {" +
                "saldo atual = " + this.saldo +
                ", cheque especial = " + this.chequeEspecial +
                '}';
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }
    public void sacar(double saque) {
        if (this.saldo >= saque) {
            this.saldo -= saque;
            System.out.println("Saque feito com sucesso.");
        }
        else if (saque <= (this.saldo + this.limiteChequeEspecial)) {
            double diferenca = saque - this.saldo;

            this.saldo = 0;
            this.limiteChequeEspecial -= diferenca;
            this.chequeEspecial = true;

            System.out.println("Cheque especial debitado com sucesso.");
        } else {
            System.out.println("Valor ultrapassa saldo e cheque especial.");
        }
    }
    public void pagarBoleto(int codigoBoleto, double valorBoleto){
        if (codigoBoleto != 0 && this.saldo > valorBoleto){
            this.saldo -= valorBoleto;
            System.out.println("Boleto pago.");
            this.boletoPago = true;
        }else if(codigoBoleto != 0 && this.saldo < valorBoleto){
            System.out.println("Valor ultrapassa ao saldo.");
        }else {
            System.out.println("Corriga o código ou valor suficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
