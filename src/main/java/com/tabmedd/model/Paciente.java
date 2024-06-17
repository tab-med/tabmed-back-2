package com.tabmedd.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("PACIENTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente extends User {
    // Não precisa de atributos adicionais, pois herda tudo de User
}