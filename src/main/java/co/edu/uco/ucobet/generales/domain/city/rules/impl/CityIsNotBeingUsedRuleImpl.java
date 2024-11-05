package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIsNotBeingUsedRule;
import org.springframework.stereotype.Service;

@Service
public final class CityIsNotBeingUsedRuleImpl implements CityIsNotBeingUsedRule {
    @Override
    public void validate(CityDomain data) {

    }
}
