package model;

public class Acessorio {
    private int id;
    private String nome;

    public Acessorio(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
