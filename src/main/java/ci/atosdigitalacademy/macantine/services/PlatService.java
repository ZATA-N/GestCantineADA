package ci.atosdigitalacademy.macantine.services;


import ci.atosdigitalacademy.macantine.services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);
    Optional<PlatDTO> findOne(Long id);
    PlatDTO update(PlatDTO platDTO);
    List<PlatDTO> findAll();
    void delete(Long id);
    long countPlat();
}
