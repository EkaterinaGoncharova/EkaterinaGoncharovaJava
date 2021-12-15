package main.java.exceptions;

/**
 * Thrown in case if dishwasher is empty
 */
public class DishwasherIsEmptyException extends RuntimeException {

    DishwasherIsEmptyException(String errorMessage) {
        super(errorMessage);
    }

}
