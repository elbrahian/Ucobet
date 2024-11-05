package co.edu.uco.ucobet.generales.domain.city.rules;

import co.edu.uco.ucobet.generales.domain.DomainRule;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CityIdDoesExistRule extends DomainRule<UUID> {
}
