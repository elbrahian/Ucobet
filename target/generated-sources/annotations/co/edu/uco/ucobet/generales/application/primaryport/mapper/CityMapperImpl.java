package co.edu.uco.ucobet.generales.application.primaryport.mapper;

import co.edu.uco.ucobet.generales.application.primaryport.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-29T19:28:29-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDomain toDomain(RegisterNewCityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        String name = null;

        name = dto.getName();

        StateDomain state = new StateDomain(dto.getStateId(), null, null);
        UUID id = null;

        CityDomain cityDomain = new CityDomain( id, name, state );

        return cityDomain;
    }
}
