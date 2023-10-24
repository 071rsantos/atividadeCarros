package entities;
import interfaces.ICarroO;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carros;
    private final List<ICarroO> observadores;

    public Concessionaria() {
        this.carros = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
        notifyObservers(carro);
    }

    public void removeCarro(Carro carro) {
        this.carros.remove(carro);
        notifyObservers(carro);
    }

    public void addObserver(ICarroO observador) {
        this.observadores.add(observador);
    }

    public void removeObserver(ICarroO observador) {
        this.observadores.remove(observador);
    }

    private void notifyObservers(Carro carro) {
        for (ICarroO observador : observadores) {
            observador.update(carro);
        }
    }
}
