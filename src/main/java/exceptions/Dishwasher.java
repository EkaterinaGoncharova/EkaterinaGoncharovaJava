package main.java.exceptions;

public class Dishwasher {

    private int maxSize;
    private int counter;
    private boolean isRunning;
    private boolean isUnloaded;

    Dishwasher(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size cannot be " + maxSize + ". Must be greater that 0.");
        }
        this.maxSize = maxSize;
        this.counter = 0;
        this.isRunning = false;
        this.isUnloaded = false;
    }

    /**
     * Loads one dish to dishwasher
     * @exception IllegalDishwasherStateException if dishwasher is running or unloaded
     * @exception DishwasherIsFullException if dishwasher is full
     */
    public void load() {
        if(isRunning || isUnloaded) {
            throw new IllegalDishwasherStateException("Cannot load if dishwasher is running or unloaded");
        } else if(counter >= maxSize) {
            throw new DishwasherIsFullException("Cannot load if dishwasher is full");
        }
        counter++;
        System.out.println("Dishwasher is loaded");
    }

    /**
     * Unloads all dishes
     * @exception IllegalDishwasherStateException if dishwasher is running
     */
    public void unload() {
        if(isRunning) {
            throw new IllegalDishwasherStateException("Cannot unload if dishwasher is running");
        }
        isUnloaded = false;
        counter = 0;
        System.out.println("Dishwasher is unloaded");
    }

    /**
     * Starts running
     * @exception DishwasherIsEmptyException if dishwasher is empty
     * @exception IllegalDishwasherStateException if dishwasher is running
     */
    public void start() {
        if (counter == 0) {
            throw new DishwasherIsEmptyException("Cannot run if dishwasher is empty");
        } else if (isRunning) {
            throw new IllegalDishwasherStateException("Cannot start if dishwasher is running");
        }
        isRunning = true;
        System.out.println("Dishwasher is started");
    }

    /**
     * Stops running
     * @exception IllegalDishwasherStateException if dishwasher is stopped
     */
    public void stop() {
        if(!isRunning) {
            throw new IllegalDishwasherStateException("Cannot stop if dishwasher is stopped");
        }
        isRunning = false;
        isUnloaded = true;
        System.out.println("Dishwasher is stopped");
    }

}
