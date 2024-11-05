package co.edu.uco.ucobet.generales.domain.state.exceptions;

public class StateIdIsNotNullException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private StateIdIsNotNullException(String userMessage){
        super(userMessage);
    }

    public static final StateIdIsNotNullException create(){
        var userMessage = "El ID del estado no puede ser nulo";
        return new StateIdIsNotNullException(userMessage);
    }

}
