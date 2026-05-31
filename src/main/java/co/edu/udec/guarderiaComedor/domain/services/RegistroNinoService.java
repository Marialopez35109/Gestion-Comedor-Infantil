package co.edu.udec.guarderiaComedor.domain.services;
import co.edu.udec.guarderiaComedor.domain.ValueObjects.Matricula;
import co.edu.udec.guarderiaComedor.domain.model.Nino;
import co.edu.udec.guarderiaComedor.domain.exceptions.NinoException;

public class RegistroNinoService {
    private final ValidadorMatriculaSpecification validadorUnicidad;

    public RegistroNinoService(ValidadorMatriculaSpecification validadorUnicidad){
        this.validadorUnicidad = validadorUnicidad;
    }
    public void registrarNino(Nino nino) throws NinoException{
        if(!validadorUnicidad.esUnica(nino.getMatricula())){
            throw new NinoException("La matricula" + nino.getMatricula().valor() + "ya existe en el sistema");
        }
    }
}
