package co.edu.udec.guarderiaComedor.domain.ValueObjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DniTest {
    @Test
    void debeCrearDniValido(){
        Dni dni = new Dni("12345678");
        assertThat(dni.valor()).isEqualTo("12345678");
    }
    @Test
    void debeLanzarExcepcionSiDniNulo(){
        assertThatThrownBy(()-> new Dni(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("DNI invalido.");
    }
    @Test
    void debeLanzarExcepcionSiFormatoInvalido(){
        assertThatThrownBy(()-> new Dni("1234a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Debe tener entr 8-10 digitos y letras opcionalmente.");
    }
    @Test
    void debeLanzarExcepcionSiLongitudIncorrecta(){
        assertThatThrownBy(()->new Dni("123"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Debe tener entr 8-10 digitos y letras opcionalmente.");
    }
    @Test
    void debeLanzarExcepcionSiDniVacio(){
        assertThatThrownBy(()->new Dni(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("DNI invalido.");
    }


}
