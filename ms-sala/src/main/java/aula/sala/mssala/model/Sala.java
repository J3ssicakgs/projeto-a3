package aula.sala.mssala.model;

import javax.persistence.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    private Integer numeroLugares;

    public Sala() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(Integer numeroLugares) {
        this.numeroLugares = numeroLugares;
    }
}
