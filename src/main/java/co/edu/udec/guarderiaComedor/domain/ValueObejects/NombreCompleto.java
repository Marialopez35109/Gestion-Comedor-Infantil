package co.edu.udec.guarderiaComedor.domain.ValueObejects;

public record NombreCompleto(String valor) {
    public NombreCompleto{
        if(valor == null || valor.isBlank()|| valor.length()<3){
            throw new IllegalArgumentException("El nombre completo debe tener al menos 3 caracteres");

        }
    }
}
