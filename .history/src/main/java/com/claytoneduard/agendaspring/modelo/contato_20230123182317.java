package com.claytoneduard.agendaspring.modelo;

import jakarta.persistence.Entity;

@Entity(name = "contato")
public class contato {
    @I
    private long id;
    private String nome;
    private String telefone;

}
