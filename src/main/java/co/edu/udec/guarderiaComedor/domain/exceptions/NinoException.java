package co.edu.udec.guarderiaComedor.domain.exceptions;

public class NinoException extends RuntimeException{
    public NinoException(String message){
        super(message);
    }
    public NinoException(String message, Throwable cause){
        super(message, cause);
    }

}
