package ca.mcgill.ecse321.librarysystem.controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class InvalidInputException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}
    
}