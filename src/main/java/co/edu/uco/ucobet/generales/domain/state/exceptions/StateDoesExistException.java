package co.edu.uco.ucobet.generales.domain.state.exceptions;

public class StateDoesExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public StateDoesExistException(String userMessage) {
        super(userMessage);
    }

    public static final StateDoesExistException create(){
        var userMessage = "El estado ya existe";
        return new StateDoesExistException(userMessage);
    }

}
