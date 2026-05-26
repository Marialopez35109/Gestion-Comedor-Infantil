package co.edu.udec.guarderiaComedor.domain.model;

import java.time.LocalDate;

public class Nino {
    private String matricula;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private String estado;

    public Nino(String matricula, String nombreCompleto, LocalDate fechaNcimiento, LocalDate fechaIngreso, String estado) {
        this.matricula = matricula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNcimiento;
        this.fechaIngreso = fechaIngreso;
        this.estado = "Activo";
    }



}
