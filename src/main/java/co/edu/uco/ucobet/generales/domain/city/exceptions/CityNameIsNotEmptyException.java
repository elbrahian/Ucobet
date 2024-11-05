package co.edu.uco.ucobet.generales.domain.city.exceptions;

public final class CityNameIsNotEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameIsNotEmptyException(String userMessage) {
        super(userMessage);
    }

    public static final CityNameIsNotEmptyException create() {
        var userMessage = "El nombre de la ciudad no puede estar vacío";
        return new CityNameIsNotEmptyException(userMessage);
    }
}
