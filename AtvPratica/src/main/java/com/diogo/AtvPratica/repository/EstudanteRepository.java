package com.diogo.AtvPratica.repository;

import com.diogo.AtvPratica.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
