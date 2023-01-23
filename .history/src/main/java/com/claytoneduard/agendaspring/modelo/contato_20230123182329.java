package com.claytoneduard.agendaspring.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "contato")
public class contato {
    @Id
    @GeneratedValue()
    private long id;
    private String nome;
    private String telefone;

}
