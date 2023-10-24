import entities.Carro;
import entities.Cliente;
import entities.Concessionaria;
import entities.carros.ClasicF;
import entities.carros.CorsaF;


public class Principal {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Carro carro1 = new CorsaF().criarCarro();
        Carro carro2 = new ClasicF().criarCarro();

        concessionaria.addCarro(carro1);
        concessionaria.addCarro(carro2);

        Cliente cliente = new Cliente("João");
        cliente.addInteresse("Corsa");
        cliente.addInteresse("Clasic");

        concessionaria.addObserver(cliente);

        System.out.println("\nModificando carros:");
        System.out.println("Antes: " + carro1);
        System.out.println("Antes: " + carro2);
        carro1.addAcessorio("Filme");
        carro2.addAcessorio("Teto solar");
        System.out.println("------------------------------------------------------");
        concessionaria.addCarro(carro1);
        concessionaria.addCarro(carro2);
        System.out.println("Depois: " + carro1);
        System.out.println("Depois: " + carro2);

        cliente.removeInteresse("Clasic");


        System.out.println("\nClonando carro 1: (Com acessorio diferente.)");
        System.out.println("Antes: " + carro1);
        Carro carroClone = carro1.clone();
        carroClone.addAcessorio("Teto Solar");
        System.out.println("---------------------------------------------------------");
        concessionaria.addCarro(carroClone);
        System.out.println("Depois: " + carroClone);

        System.out.println("\nClonando carro 2: (Com acessorio diferente.)");
        System.out.println("Antes: "+carro2);
        Carro carroClone2 = carro2.clone();
        carroClone2.addAcessorio("Roda aro 22");
        System.out.println("----------------------------------------------------------");
        concessionaria.addCarro(carroClone2);
        System.out.println("Depois: "+carroClone2);
    }
}
