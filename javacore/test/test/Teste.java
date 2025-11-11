package javacore.test.test;

import javacore.test.dominio.CarroEsportivo;
import javacore.test.dominio.CarroPopular;
import javacore.test.dominio.CarroEletrico;
import javacore.test.dominio.CarroPopular;

public class Teste {
    static void main() {
        CarroPopular carro1 = new CarroPopular("Mercedes", "CLA200", 2015);
        carro1.status();
        carro1.acelerar(230);


        CarroEletrico carro2 = new CarroEletrico("BYD", "hybrid", 2022, 45);
        carro2.carregarBateria(45);
        carro2.acelerar(230);
        carro2.status();


        CarroEsportivo carro3 = new CarroEsportivo("Jaguar", "FF", 2023);
        carro3.setTurboAtivado(true);
        carro3.acelerar(230);
        carro3.status();


    }
}
