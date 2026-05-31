package co.edu.udec.guarderiaComedor.domain.services;
import co.edu.udec.guarderiaComedor.domain.ValueObjects.Matricula;

@FunctionalInterface
public interface ValidadorMatriculaSpecification {
    boolean esUnica(Matricula matricula);

}
