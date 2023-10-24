package entities;
import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private String cor;
    private List<String> acessorios;
    private double price;

    public Carro(String modelo, String cor, double price) {
        this.modelo = modelo;
        this.cor = cor;
        this.price = price;
        this.acessorios = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getAcessorios() {
        return acessorios;
    }

    public void addAcessorio(String acessorio) {
        this.acessorios.add(acessorio);
    }

    public void removeAcessorio(String acessorio) {
        this.acessorios.remove(acessorio);
    }

    public Carro clone() {
        return new Carro(this.modelo, this.cor, this.price);
    }

    public String toString() {
        return "Modelo: " + this.modelo + ", Cor: " + this.cor + ", Acessorios: " + this.acessorios;
    }
}