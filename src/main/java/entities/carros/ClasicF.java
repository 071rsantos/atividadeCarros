package entities.carros;

import entities.Carro;
import interfaces.ICarroF;

public class ClasicF implements ICarroF {
    @Override
    public Carro criarCarro() {
        return new Carro("Clasic", "Preto", 15000.00);
    }
}
