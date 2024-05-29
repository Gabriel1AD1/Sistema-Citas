package com.helpdesk.sistemacitas.repository;

import com.helpdesk.sistemacitas.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientoRepository extends JpaRepository<Paciente, Long> {
}
