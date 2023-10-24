package entities.carros;

import entities.Carro;
import interfaces.ICarroF;

public class CorsaF implements ICarroF {
    @Override
    public Carro criarCarro() {
        return new Carro("Corsa", "Branco", 10000.00);
    }
}
