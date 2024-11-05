package co.edu.uco.ucobet.generales.application.secondaryport.mapper;

import co.edu.uco.ucobet.generales.application.secondaryport.entity.CityEntity;
import co.edu.uco.ucobet.generales.application.secondaryport.entity.StateEntity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-29T19:28:29-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class CityEntityMapperImpl implements CityEntityMapper {

    @Override
    public CityEntity toEntity(CityDomain domain) {
        if ( domain == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = domain.getId();
        name = domain.getName();

        StateEntity state = new StateEntity(domain.getState().getId(), null, null);

        CityEntity cityEntity = new CityEntity( id, name, state );

        return cityEntity;
    }
}
