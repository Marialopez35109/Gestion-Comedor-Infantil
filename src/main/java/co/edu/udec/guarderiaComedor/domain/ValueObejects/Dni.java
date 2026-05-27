package co.edu.udec.guarderiaComedor.domain.ValueObejects;

public record Dni(String valor) {
    public Dni{
        if(valor == null || valor.isBlank() || !valor.matches("\\d{8,10}[A-Z]?")){
            throw new IllegalArgumentException("DNI invalido. Debe tener entr 8-10 digitos y letras opcionalmente.");
        }
    }
}
