package com.tabmedd.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("MEDICO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico extends User {
    @Column(nullable = false)
    private String funcao;

    @Column(nullable = false, unique = true)
    private String crm;
}
