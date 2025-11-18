package javacore.test.carros.dominio;

public class CarroPopular extends Veiculo {

    public CarroPopular(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;

    }

    public void status() {
        System.out.println("Novo carro "+ this.getModelo() +" criado.");
        System.out.println("\n -- Detalhes do " + this.getModelo() + " --");
        carroDoAno();
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println(this.modelo + " Acelerou para " + this.velocidadeAtual);
        } else {
            System.out.println("Deve ser maior que 0");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0 && this.velocidadeAtual >= decremento) {
            this.velocidadeAtual -= decremento;
            System.out.println(this.modelo + " freou para " + this.velocidadeAtual);
        } else if (decremento > 0 && this.velocidadeAtual < decremento) {
            this.velocidadeAtual = 0;
            System.out.println(this.modelo + " freou e parou.");
        } else {
            System.out.println("Valor deve ser positivo.");
        }
    }
}
