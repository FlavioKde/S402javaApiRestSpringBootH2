package cat.itacademy.s04.t02.n01.S04T02N01.exception.handlers;


import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.S04T02N01.exception.exceptions.InvalidFruitDataException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FruitAlreadyExistException.class)
    public ResponseEntity<String>handleFruitAlreadyExist(FruitAlreadyExistException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);//409
    }

    @ExceptionHandler(FruitNotFoundException.class)
    public String handleFruitNotFound(FruitNotFoundException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error/404";
    }
    @ExceptionHandler(InvalidFruitDataException.class)
    public ResponseEntity<String>handleInvalidFruitDataException (InvalidFruitDataException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);//400
    }


}
