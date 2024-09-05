package ci.atosdigitalacademy.macantine.services.mapper;


import ci.atosdigitalacademy.macantine.models.Plat;
import ci.atosdigitalacademy.macantine.services.dto.PlatDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat> {

}
