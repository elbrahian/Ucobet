package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityIdRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.*;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewCityIdRulesValidatorImpl implements RegisterNewCityIdRulesValidator {

    private CityIdDoesntExistRule cityIdDoesntExistRule;


    public RegisterNewCityIdRulesValidatorImpl(final CityIdDoesntExistRule cityIdDoesntExistRule) {
        this.cityIdDoesntExistRule = cityIdDoesntExistRule;
    }

    @Override
    public void validate(final CityDomain data) {
        data.generateId();
        cityIdDoesntExistRule.validate(data.getId());
    }
}
