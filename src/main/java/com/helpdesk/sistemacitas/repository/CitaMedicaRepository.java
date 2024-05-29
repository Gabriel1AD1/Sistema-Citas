package com.helpdesk.sistemacitas.repository;

import com.helpdesk.sistemacitas.models.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long> {
    List<CitaMedica> findByPacienteId(Long pacienteId);


}
