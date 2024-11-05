package co.edu.uco.ucobet.generales.domain.city.exceptions;

public final class CityStateDoesntExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityStateDoesntExistException(String userMessage){
        super(userMessage);
    }

    public static final CityStateDoesntExistException create(){
        String userMessage = "No existe el estado con el ID indicado";
        return new CityStateDoesntExistException(userMessage);
    }
}
