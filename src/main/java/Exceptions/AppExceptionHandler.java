package Exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice // Global Exceptional Handler
public class AppExceptionHandler {

    @ExceptionHandler(value = IncorrectSourceAndDestinationException.class)
    public String handleIncorrectSourceAndDestinationException(){
        return "customError";
    }
}
