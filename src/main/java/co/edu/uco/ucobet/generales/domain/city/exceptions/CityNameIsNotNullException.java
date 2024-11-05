package co.edu.uco.ucobet.generales.domain.city.exceptions;

public final class CityNameIsNotNullException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameIsNotNullException(String userMessage){
        super(userMessage);
    }

    public static final CityNameIsNotNullException create(){
        String userMessage = "El nombre de la ciudad no puede ser nulo.";
        return new CityNameIsNotNullException(userMessage);
    }
}
