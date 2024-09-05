package ci.atosdigitalacademy.macantine.services.impl;




import ci.atosdigitalacademy.macantine.repositories.PlatRepository;
import ci.atosdigitalacademy.macantine.services.PlatService;
import ci.atosdigitalacademy.macantine.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    @Override
    public PlatDTO save(PlatDTO platDTO) {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return null;
    }

    @Override
    public List<PlatDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public long countPlat() {
        return platRepository.count();
    }
}
