package co.edu.udec.guarderiaComedor.domain.ValueObjects;

public record Direccion(String valor) {
    public Direccion{
        if(valor==null || valor.isBlank()){
            throw new IllegalArgumentException("No puede estar vacia.");
        }
        if(valor.length()<5){
            throw new IllegalArgumentException("La direccion debe tener al menos 5 caracteres");
        }
    }

}
