package javacore.metodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double media = 0;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        double media = 0;
        if(salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            System.out.println("\nMédia salarial " + media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
// nullpointerexception = valores inexistentes
