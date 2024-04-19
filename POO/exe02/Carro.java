package exe02;
public class Carro {
    private String cor;
    private double preco;
    private String modelo;

    // construtor: serve para instanciar a classe criada
    //Quando criar o objeto carro ele terá os 3 atributos
    //O construtor é como se fosse o molde
    public Carro(String modelo, double preco, String cor) {
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
    }
    //método
    public double getPreco() {
        return preco;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void ligarCarro(){
        System.out.println("\nO carro está ligado");
    }

}
