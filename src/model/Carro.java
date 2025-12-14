package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToMany
    private List<Acessorio> acessorios;

    public Carro() {}

    public Carro(String modelo, Marca marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
