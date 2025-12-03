package src.maratonajava.javacore.modificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velicidadeMaxima;
    private static double velicidadeLimite = 250;  //Modificador estático (pertence á classe) todas instâncias de carro afetadas.

    public Carro(String nome, double velicidadeMaxima) {
        this.nome = nome;
        this.velicidadeMaxima = velicidadeMaxima;
    }

    public void imprimir() {
        System.out.println("--------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima " + this.velicidadeMaxima);
        System.out.println("Velicidade Limite " + Carro.velicidadeLimite);
    }

    public static void setVelicidadeLimite(double velicidadeMaxima) {
        Carro.velicidadeLimite = velicidadeLimite;
    }

    public static double getVelicidadeLimite() {
        return Carro.velicidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelicidadeMaxima() {
        return velicidadeMaxima;
    }

    public void setVelicidadeMaxima(double velicidadeMaxima) {
        this.velicidadeMaxima = velicidadeMaxima;
    }
}