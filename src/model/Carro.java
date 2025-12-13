package model;

public class Carro {
    private int id;
    private String modelo;
    private Marca marca;

    public Carro(int id, String modelo, Marca marca) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }
}
