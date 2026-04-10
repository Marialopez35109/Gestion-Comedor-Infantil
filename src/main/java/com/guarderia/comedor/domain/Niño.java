package com.guarderia.comedor.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Niño {
    private String matricula;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private String estado;

    public Niño(String matricula, String nombreCompleto,LocalDate fechaNcimiento, LocalDate fechaIngreso,String estado) {
        this.matricula = matricula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNcimiento;
        this.fechaIngreso = fechaIngreso;
        this.estado = "Activo";
    }


}
