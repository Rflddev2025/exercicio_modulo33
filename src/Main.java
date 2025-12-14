import jakarta.persistence.EntityManager;
import java.util.List;

import model.Marca;
import model.Carro;
import model.Acessorio;
import util.JPAUtil;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();

        Marca marca = new Marca("Toyota");

        Acessorio ar = new Acessorio("Ar Condicionado");
        Acessorio abs = new Acessorio("ABS");

        Carro carro = new Carro("Corolla", marca);
        carro.setAcessorios(List.of(ar, abs));

        em.persist(marca);
        em.persist(ar);
        em.persist(abs);
        em.persist(carro);

        em.getTransaction().commit();
        em.close();

        System.out.println("Entidades JPA persistidas com sucesso!");
    }
}
