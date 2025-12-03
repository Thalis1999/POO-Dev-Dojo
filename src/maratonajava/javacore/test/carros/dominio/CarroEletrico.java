package src.maratonajava.javacore.test.carros.dominio;

public class CarroEletrico extends CarroPopular{
    private static final double TAXA_CARGA_POR_HORA = 25.0;
    private int nivelBateria;

    public CarroEletrico(String marca, String modelo, int ano, int nivelBateriaInicial) {
        super(marca, modelo, ano);
        this.nivelBateria = Math.min(100, nivelBateriaInicial);
    }

    public void status() {
        System.out.println("Novo carro "+ this.getModelo() +" criado.");
        System.out.println("\n -- Detalhes do " + this.getModelo() + " --");
        carroDoAno();
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Bateria em: " + this.getNivelBateria());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
    }

    public void carregarBateria(double horas) {
        if (horas <= 0) {
            System.out.println("Tempo insuficiente para carregamento.");
        }
        double cargaRecebida = horas * TAXA_CARGA_POR_HORA;
        double novoNivel = this.nivelBateria + cargaRecebida;
        int nivelFinal = (int) Math.min(100, novoNivel);

        if (this.nivelBateria == nivelFinal) {
            System.out.println(getModelo() + " Totalmente carregado.");
        } else {
            System.out.println(getModelo() + " Carregou por " + horas + " horas.");
            System.out.println("Nível anterior " + this.nivelBateria + "%.");

            this.nivelBateria = nivelFinal;
            System.out.println("Nível final: " + this.nivelBateria + "%.");
        }
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
