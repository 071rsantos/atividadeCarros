package entities.carros;

import entities.Carro;
import interfaces.ICarroP;

public class CorsaP implements ICarroP {
    private final Carro corsa;

    public CorsaP() {
        corsa = new Carro("Corsa", "Roxo", 10000.00);
    }

    @Override
    public Carro clone() {
        return corsa.clone();
    }
    }
