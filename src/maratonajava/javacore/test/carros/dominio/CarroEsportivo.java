package src.maratonajava.javacore.test.carros.dominio;

public class CarroEsportivo extends CarroPopular{
    private boolean turboAtivado;

    public CarroEsportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.turboAtivado = false;
    }

    @Override
    public void status() {
        System.out.println("Novo carro "+ this.getModelo() +" criado.");
        System.out.println("\n -- Detalhes do " + this.getModelo() + " --");
        carroDoAno();
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Turbo: " + this.getTurboAtivado());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
    }

    public void acelerar(double incremento) {
        if (this.turboAtivado) {
            this.velocidadeAtual = incremento * 0.5;
            System.out.println("Turbo ativado! impulso de 50% na velocidade");
        }
    }

    public void frear(double decremento) {
        super.frear(decremento);
    }

    public boolean getTurboAtivado() {
        return turboAtivado;
    }

    public void setTurboAtivado(boolean turbo) {
        this.turboAtivado = turbo;
    }
}
