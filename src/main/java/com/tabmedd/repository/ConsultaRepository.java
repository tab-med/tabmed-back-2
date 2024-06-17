package com.tabmedd.repository;

import com.tabmedd.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    //findByPaciente, findByMedico, findByRecepcao
}
