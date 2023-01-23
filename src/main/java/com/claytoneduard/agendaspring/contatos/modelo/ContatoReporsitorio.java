package com.claytoneduard.agendaspring.contatos.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos" , path = "contatos")
public interface ContatoReporsitorio extends JpaRepository<Contato, Long>{
    
}
