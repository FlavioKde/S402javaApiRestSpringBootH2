package cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions;

public class FruitAlreadyExistException extends RuntimeException {
    public FruitAlreadyExistException(String name) {
        super("The proportionate ID is not correct");
    }
}
