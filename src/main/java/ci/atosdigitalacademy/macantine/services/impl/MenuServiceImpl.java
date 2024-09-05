package ci.atosdigitalacademy.macantine.services.impl;



import ci.atosdigitalacademy.macantine.models.Menu;
import ci.atosdigitalacademy.macantine.repositories.MenuRepository;
import ci.atosdigitalacademy.macantine.services.MenuService;
import ci.atosdigitalacademy.macantine.services.dto.MenuDTO;
import ci.atosdigitalacademy.macantine.services.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO)
    {
        Menu menu = menuMapper.DtoToEntity(menuDTO);
        return menuMapper.ToDto(menuRepository.save(menu));
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        return null;
    }

    @Override
    public List<MenuDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public long countMenu() {
        return menuRepository.count();
    }
}
