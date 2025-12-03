package src.maratonajava.javacore.test.carros.dominio;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public double velocidadeAtual;

    abstract void status();
    abstract void acelerar(double incremento);
    abstract void frear(double decremento);

    public void carroDoAno(){
        if (this.ano >= 2015 && this.ano <= 2025){
            System.out.println("Ano do " + this.getModelo() + " é " + this.getAno() + ".");
        } else {
            System.out.println("O " + this.getModelo() + " é antigo. Porém válido.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
