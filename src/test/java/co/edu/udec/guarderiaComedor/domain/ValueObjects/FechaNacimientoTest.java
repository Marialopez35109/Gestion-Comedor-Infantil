package co.edu.udec.guarderiaComedor.domain.ValueObjects;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.*;

public class FechaNacimientoTest {
    @Test
    void debeCrearFechaNacimientoValida(){
        LocalDate fecha= LocalDate.of(2021,5,15);
        FechaNacimiento fNacimiento = new FechaNacimiento(fecha);
        assertThat(fNacimiento.valor()).isEqualTo(fecha);
    }
    @Test
    void debeLanxarExcepcionSiFechaNula(){
        assertThatThrownBy(()->new FechaNacimiento(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("La fecha no puede ser nula");
    }
    @Test
    void debeLanzarExcepcionSiFechaFutura(){
        LocalDate fechaFutura = LocalDate.now().plusDays(1);
        assertThatThrownBy(()->new FechaNacimiento(fechaFutura))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("La fecha no puede ser futura a la fecha actual");
    }

}
