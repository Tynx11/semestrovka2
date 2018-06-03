package org.anton.drozdov.JPA.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.anton.drozdov.JPA.Model.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
    Player findByName(String name);
}
