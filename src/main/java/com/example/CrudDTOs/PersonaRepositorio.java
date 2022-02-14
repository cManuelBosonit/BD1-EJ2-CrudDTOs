package com.example.CrudDTOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    Persona findByUsuario(String usuario);
    Persona deleteById(int id_persona);

}
