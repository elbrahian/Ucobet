package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameLenghtIsValidException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameLengthIsValidRule;
import org.springframework.stereotype.Service;

@Service
public final class CityNameLengthIsValidRuleImpl implements CityNameLengthIsValidRule {
    @Override
    public void validate(final String data) {
        if(data.length()<=0){
            throw CityNameLenghtIsValidException.create();
        }
    }
}
