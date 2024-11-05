package co.edu.uco.ucobet.generales.domain.state.exceptions;

public class StateIdIsNotDefaultValueException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public StateIdIsNotDefaultValueException(String userMessage) {
        super(userMessage);
    }

    public static final StateIdIsNotDefaultValueException create() {
        var userMessage = "El ID del estado no es el valor por defecto";
        return new StateIdIsNotDefaultValueException(userMessage);
    }

}
