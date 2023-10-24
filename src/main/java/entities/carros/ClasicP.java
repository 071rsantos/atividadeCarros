package entities.carros;

import entities.Carro;
import interfaces.ICarroP;

public class ClasicP implements ICarroP {
    private final Carro clasic;

    public ClasicP() {
        clasic = new Carro("Clasic", "Cinza", 15000.00);
    }

    @Override
    public Carro clone() {
        return clasic.clone();
    }
}