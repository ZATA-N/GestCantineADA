package ci.atosdigitalacademy.macantine.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String creationDate;

    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<Plat> plats;
}

