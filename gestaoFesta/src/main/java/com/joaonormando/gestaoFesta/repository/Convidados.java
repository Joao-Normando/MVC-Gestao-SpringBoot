package com.joaonormando.gestaoFesta.repository;

import com.joaonormando.gestaoFesta.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
