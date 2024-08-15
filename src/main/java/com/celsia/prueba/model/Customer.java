package com.celsia.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;

@Data
@Entity(name = "clientes")
public class Customer {

    @Id
    @Column(name = "identificacion", nullable = false, length = 20, unique = true)
    private String identification;
    @Column(name = "nombres", nullable = false, length = 80)
    private String name;
    @Column(name = "apellidos", nullable = false, length = 80)
    private String lastName;
    @Column(name = "tipoidentificacion", nullable = false, length = 2)
    private String identificationType;
    @Column(name = "fechanacimiento", nullable = false)
    private Date birthDate;
    @Column(name = "numerocelular", nullable = false, length = 20)
    private String phoneNumber;
    @Column(name = "correoelectronico", nullable = false, length = 80)
    private String email;


}