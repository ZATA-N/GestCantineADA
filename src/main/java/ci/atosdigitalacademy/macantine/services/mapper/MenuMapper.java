package ci.atosdigitalacademy.macantine.services.mapper;


import ci.atosdigitalacademy.macantine.models.Menu;
import ci.atosdigitalacademy.macantine.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
