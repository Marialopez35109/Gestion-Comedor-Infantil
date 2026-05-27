package co.edu.udec.guarderiaComedor.domain.ValueObjects;
import co.edu.udec.guarderiaComedor.domain.ValueObejects.Matricula;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MatriculaTest {

    @Test
    void debeCrearMatriculaValida(){
        Matricula matricula= new Matricula("ABC123");
        assertThat(matricula.valor()).isEqualTo("ABC123");
    }
    @Test
    void debeLanzarExcepcionSiMatriculaVacia(){
        assertThatThrownBy(()->new  Matricula(""))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("La matricula no puede estar vacia");
    }
    @Test
    void debeLanzarExcepcionSiFormatoInvalido(){
        assertThatThrownBy(()-> new Matricula("a?1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Matricula invalida, Usar 3-10 caracteres");
    }
}

