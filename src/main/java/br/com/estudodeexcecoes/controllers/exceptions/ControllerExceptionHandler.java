package br.com.estudodeexcecoes.controllers.exceptions;

import br.com.estudodeexcecoes.service.exceptions.PersonNotFoundException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class ControllerExceptionHandler {

    private final LocalDateTime DATE_TIME = LocalDateTime.now();

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<StandardError> personNotFound(PersonNotFoundException e, HttpServletRequest request){

        StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), DATE_TIME);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

    }


}
