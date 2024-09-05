package ci.atosdigitalacademy.macantine.services.mapper;

public interface EntityMapper <D , E>{

    D ToDto(E entity);
    E DtoToEntity(D dto);
}
