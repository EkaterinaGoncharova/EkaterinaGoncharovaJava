package main.java.exceptions;

public class DishwasherMain {

    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher(3);
        dishwasher.load();
        dishwasher.load();
        dishwasher.load();
        dishwasher.start();
        dishwasher.stop();
        dishwasher.unload();
    }
}
