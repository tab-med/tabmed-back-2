package com.tabmedd.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("RECEPCAO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recepcao extends User {
    @Column(nullable = false)
    private String turno;

    @Column(nullable = false)
    private String ocupacao;

    // Getters e setters
}
