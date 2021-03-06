package com.example.CrudDTOs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PersonaInputDTO {

    int id_persona;
    String usuario;
    String password;
    String name;
    String surname;
    String personal_email;
    String company_email;
    String city;
    Boolean active;
    LocalDateTime createdDate;
    String imagen_url;
    LocalDateTime terminationDate;

    public Persona persona() {
        Persona persona = new Persona();
        persona.setId_persona(this.getId_persona());
        persona.setUsuario(this.getUsuario());
        persona.setPassword(this.getPassword());
        persona.setName(this.getName());
        persona.setSurname(this.getSurname());
        persona.setCompany_email(this.getCompany_email());
        persona.setPersonal_email(this.getPersonal_email());
        persona.setCity(this.getCity());
        persona.setActive(this.getActive());
        persona.setCreated_date(this.getCreatedDate());
        persona.setImagen_url(this.getImagen_url());
        persona.setTermination_date(this.getTerminationDate());
        return persona;
    }
}
