package co.edu.udec.guarderiaComedor.domain.ValueObjects;
import java.util.UUID;

public record RegistroConsumoId(String valor) {
    public RegistroConsumoId{
        if(valor==null || valor.isBlank()){
            throw new NullPointerException("El ID del registro de consumo no puede estar vacio");
        }
    }
    public static RegistroConsumoId random(){
        return new RegistroConsumoId(UUID.randomUUID().toString());
    }
}
