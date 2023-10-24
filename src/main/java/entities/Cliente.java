package entities;

import interfaces.ICarroO;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ICarroO {
    private final String nome;
    private final List<String> interesses;

    public Cliente(String nome) {
        this.nome = nome;
        this.interesses = new ArrayList<>();
    }

    public void addInteresse(String interesse) {
        this.interesses.add(interesse);
    }

    public void removeInteresse(String interesse) {
        this.interesses.remove(interesse);
    }

    public void update(Carro carro) {
        if (this.interesses.contains(carro.getModelo())) {
            System.out.println("Cliente, " + this.nome + ". O " + carro.getModelo() + " que você tem interesse, está disponível na cor " + carro.getCor() + String.format("Por: R$ %.2f" ,carro.getPrice()) + ".");
        }
    }
}