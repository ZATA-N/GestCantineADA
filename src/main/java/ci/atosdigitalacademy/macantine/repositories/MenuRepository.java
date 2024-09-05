package ci.atosdigitalacademy.macantine.repositories;


import ci.atosdigitalacademy.macantine.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MenuRepository extends JpaRepository<Menu, Long> {
}
