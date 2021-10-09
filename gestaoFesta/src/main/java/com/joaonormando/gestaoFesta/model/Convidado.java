package com.joaonormando.gestaoFesta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    private static long serialVersionUID = 1;

    @Id
    @GeneratedValue
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
}
