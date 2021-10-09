package com.joaonormando.gestaoFesta.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Convidado implements Serializable {
    private static long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;

    private Integer quantidadeAcompanhantes;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Convidado.serialVersionUID = serialVersionUID;
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

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
        this.quantidadeAcompanhantes = quantidadeAcompanhante;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return id.equals(convidado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidadeAcompanhantes=" + quantidadeAcompanhantes +
                '}';
    }
}