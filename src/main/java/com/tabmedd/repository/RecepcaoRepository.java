package com.tabmedd.repository;

import com.tabmedd.model.Recepcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcaoRepository extends JpaRepository<Recepcao, Long> { }
