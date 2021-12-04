package main.java.exceptions;

/**
 * Thrown in case if dishwasher has illegal state
 */
public class IllegalDishwasherStateException extends RuntimeException {

    IllegalDishwasherStateException(String errorMessage) {
        super(errorMessage);
    }

}
