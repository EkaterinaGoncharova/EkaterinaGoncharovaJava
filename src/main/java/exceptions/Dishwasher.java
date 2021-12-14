package main.java.exceptions;

public class Dishwasher {

    private final int maxSize;
    private int counter;
    private DishwasherStatus status;

    Dishwasher(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size cannot be " + maxSize + ". Must be greater that 0.");
        }
        this.maxSize = maxSize;
        this.counter = 0;
        this.status = DishwasherStatus.EMPTY;
    }

    /**
     * Loads one dirty dish to dishwasher
     * @exception IllegalDishwasherStateException if dishwasher is running or unloaded
     * @exception DishwasherIsFullException if dishwasher is full
     */
    public void load() {
        if(!(status == DishwasherStatus.EMPTY || status == DishwasherStatus.DIRTY)) {
            throw new IllegalDishwasherStateException("Cannot load if dishwasher is running or clean dishes are not unloaded");
        }
        if(counter >= maxSize) {
            throw new DishwasherIsFullException(String.format("Cannot load more dishes. Max size is %d", maxSize));
        }
        status = DishwasherStatus.DIRTY;
        counter++;
        System.out.println("One dirty dish is loaded");
    }

    /**
     * Starts washing
     * @exception DishwasherIsEmptyException if dishwasher is empty
     */
    public void start() {
        if (status != DishwasherStatus.DIRTY) {
            throw new DishwasherIsEmptyException("Cannot start if dishwasher is not loaded");
        }
        status = DishwasherStatus.WASHING;
        System.out.println("Dishwasher is started");
    }

    /**
     * Stops washing
     * @exception IllegalDishwasherStateException if dishwasher is stopped
     */
    public void stop() {
        if(status != DishwasherStatus.WASHING) {
            throw new IllegalDishwasherStateException("Cannot stop if dishwasher is not running");
        }
        status = DishwasherStatus.STOPPED;
        System.out.println("Dishwasher is stopped");
    }

    /**
     * Unloads all clean dishes
     * @exception IllegalDishwasherStateException if dishwasher is running
     */
    public void unload() {
        if(status != DishwasherStatus.STOPPED) {
            throw new IllegalDishwasherStateException("Cannot unload if dishwasher is not stopped");
        }
        status = DishwasherStatus.EMPTY;
        counter = 0;
        System.out.println("All clean dishes are unloaded");
    }

}
