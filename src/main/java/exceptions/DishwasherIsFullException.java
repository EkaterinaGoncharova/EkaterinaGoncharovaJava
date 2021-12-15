package main.java.exceptions;

/**
 * Thrown in case if dishwasher is full
 */
public class DishwasherIsFullException extends RuntimeException{

    DishwasherIsFullException(String errorMessage) {
        super(errorMessage);
    }

}
