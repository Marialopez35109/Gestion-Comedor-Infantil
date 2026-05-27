package co.edu.udec.guarderiaComedor.domain.ValueObjects;
import co.edu.udec.guarderiaComedor.domain.ValueObejects.NombreCompleto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NombreCompletoTest {

    @Test
    void debeCrearNombreCompletoValido() {
        NombreCompleto nombre = new NombreCompleto("Maria López");
        assertThat(nombre.valor()).isEqualTo("Maria López");
    }

    @Test
    void debeLanzarExcepcionSiNombreVacio() {
        assertThatThrownBy(() -> new NombreCompleto(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("");
    }

    @Test
    void debeLanzarExcepcionSiNombreCorto() {
        assertThatThrownBy(() -> new NombreCompleto("M"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("El nombre completo debe tener al menos 3 caracteres");

    }

    @Test
    void debeLanzarExcepcionSiNombreTieneNumero() {
        assertThatThrownBy(() -> new NombreCompleto("Maria 123"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Solo letras y espacios");

    }
    @Test
    void debeAceptarNombresConTildes(){
        NombreCompleto nombre= new NombreCompleto("María López");
        assertThat(nombre.valor()).isEqualTo("María López");
    }
}
