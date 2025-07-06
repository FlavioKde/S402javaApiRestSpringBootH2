package cat.itacademy.s04.t02.n01.S04T02N01.repository.interfaces;

import cat.itacademy.s04.t02.n01.S04T02N01.model.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FruitRepository extends JpaRepository<Fruit, Long>{

        Optional<Fruit> findByName(String name);
}


