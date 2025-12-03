package src.maratonajava.javacore.heranca.dominio;

// Especilização de Pessoa
public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Bloco static Funcionario");
    }
    {
        System.out.println("Bloco inic1 Funcionario");
    }
    {
        System.out.println("Bloco inic2 Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro construtor Funcionario");
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
