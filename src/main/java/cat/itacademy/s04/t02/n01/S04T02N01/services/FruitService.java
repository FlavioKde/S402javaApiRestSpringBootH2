package cat.itacademy.s04.t02.n01.S04T02N01.services;

import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.InvalidFruitDataException;
import cat.itacademy.s04.t02.n01.S04T02N01.model.entity.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.repository.interfaces.FruitRepository;
import cat.itacademy.s04.t02.n01.S04T02N01.services.interfaces.FruitServiceI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService implements FruitServiceI {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public FruitRepository getFruitRepository() {
        return fruitRepository;
    }
    @Override
    public Fruit save(Fruit fruit){
        if (fruit.getName() == null || fruit.getName().trim().isEmpty()){
            throw new InvalidFruitDataException(fruit);
        } else if (fruitRepository.findByName(fruit.getName()).isPresent()) {
            throw new FruitAlreadyExistException(fruit.getName());
        }
        return fruitRepository.save(fruit);

    }

    public Fruit update(Fruit fruit){
        if (!fruitRepository.existsById(fruit.getId())){
            throw new FruitNotFoundException(fruit.getId());
        }
        return fruitRepository.save(fruit);
    }
    @Override
    public List<Fruit> findAll(){
        return fruitRepository.findAll();
    }
    public Fruit findById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public void deleteById(Long id){
        fruitRepository.deleteById(id);

    }
}
