package co.edu.uco.ucobet.generales.domain.city.exceptions;

public final class CityNameFormatIsValidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameFormatIsValidException(String userMessage){
        super(userMessage);
    }

    public static final CityNameFormatIsValidException create() {
        var userMessage = "Nombre de la ciudad no tiene formato valido";
        return new CityNameFormatIsValidException(userMessage);
    }

}
