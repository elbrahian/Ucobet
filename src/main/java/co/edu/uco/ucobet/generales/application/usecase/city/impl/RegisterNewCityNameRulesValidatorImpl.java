package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityNameRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.*;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewCityNameRulesValidatorImpl implements RegisterNewCityNameRulesValidator {
    private CityNameLengthIsValidRule cityNameLengthIsValidRule;
    private CityNameFormatIsValidRule cityNameFormatIsValidRule;
    private CityNameIsNotNullRule cityNameIsNotNullRule;
    private CityNameIsNotEmptyRule cityNameIsNotEmptyRule;
    private CityNameForStateDoesntExistRule cityNameForStateDoesntExistRule;


    public RegisterNewCityNameRulesValidatorImpl(final CityNameLengthIsValidRule cityNameLengthIsValidRule,
                                                   final CityNameFormatIsValidRule cityNameFormatIsValidRule,
                                                   final CityNameIsNotNullRule cityNameIsNotNullRule,
                                                   final CityNameIsNotEmptyRule cityNameIsNotEmptyRule,
                                                   final CityNameForStateDoesntExistRule cityNameForStateDoesntExistRule) {
        this.cityNameLengthIsValidRule = cityNameLengthIsValidRule;
        this.cityNameFormatIsValidRule = cityNameFormatIsValidRule;
        this.cityNameIsNotNullRule = cityNameIsNotNullRule;
        this.cityNameIsNotEmptyRule = cityNameIsNotEmptyRule;
        this.cityNameForStateDoesntExistRule = cityNameForStateDoesntExistRule;
    }

    @Override
    public void validate(final CityDomain data) {
        cityNameLengthIsValidRule.validate(data.getName());
        cityNameIsNotNullRule.validate(data.getName());
        cityNameFormatIsValidRule.validate(data.getName());
        cityNameForStateDoesntExistRule.validate(data);
        cityNameIsNotEmptyRule.validate(data.getName());
    }
}
