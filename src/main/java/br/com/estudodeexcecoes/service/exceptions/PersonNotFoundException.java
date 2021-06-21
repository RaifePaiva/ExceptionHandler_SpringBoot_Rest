package br.com.estudodeexcecoes.service.exceptions;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String msg){
        super(msg);
    }


}
