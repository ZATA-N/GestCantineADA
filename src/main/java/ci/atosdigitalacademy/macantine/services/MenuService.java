package ci.atosdigitalacademy.macantine.services;


import ci.atosdigitalacademy.macantine.services.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    MenuDTO save(MenuDTO menuDTO);
    Optional<MenuDTO> findOne(Long id);
    MenuDTO update(MenuDTO menuDTO);
    List<MenuDTO> findAll();
    void delete(Long id);
    long countMenu();
}
