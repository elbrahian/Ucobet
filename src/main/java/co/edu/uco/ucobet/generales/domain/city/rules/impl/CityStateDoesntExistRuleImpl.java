package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.repository.CityRepository;
import co.edu.uco.ucobet.generales.domain.city.rules.CityStateDoesntExistRule;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import org.springframework.stereotype.Service;

@Service
public final class CityStateDoesntExistRuleImpl implements CityStateDoesntExistRule {
    private final CityRepository cityRepository;

    public CityStateDoesntExistRuleImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void validate(StateDomain data) {
    }
}
