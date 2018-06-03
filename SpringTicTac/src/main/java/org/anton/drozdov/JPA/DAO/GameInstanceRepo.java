package org.anton.drozdov.JPA.DAO;
import org.anton.drozdov.JPA.Model.GameInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameInstanceRepo extends JpaRepository<GameInstance, Integer> {
}
