package co.edu.uco.ucobet.generales.domain.city.exceptions;

public final class CityNameLenghtIsValidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameLenghtIsValidException(String userMessage){
        super(userMessage);
    }

    public static CityNameLenghtIsValidException create(){
        var userMessage = "Nombre de la ciudad esta vacio";
        return new CityNameLenghtIsValidException(userMessage);
    }







}
