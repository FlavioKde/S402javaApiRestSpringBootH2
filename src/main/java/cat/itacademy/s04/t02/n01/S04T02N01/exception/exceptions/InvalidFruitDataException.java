package cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions;

import cat.itacademy.s04.t02.n01.S04T02N01.model.entity.Fruit;

public class InvalidFruitDataException extends RuntimeException {
    public InvalidFruitDataException(Fruit fruit) {
        super("A name is needed to be able to validate");
    }
}
