package ua.bykadoroff.hw11;

public class Car implements Recovery {
    private String model;
    private int year;
    private String color;
    private double fuelTank;
    private double fuelInTank;
    private double fuelPerKilometers;

    public Car(String model, int year, String color, double fuelTank, double fuelInTank, double fuelPerKilometers) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelTank = fuelTank;
        this.fuelInTank = fuelInTank;
        this.fuelPerKilometers = fuelPerKilometers;
    }

    protected void run() {
        if (getFuelInTank() > 0) {
            System.out.println("Car is running");
            setFuelInTank(getFuelTank() - getFuelPerKilometers());
        } else {
            System.out.println("Fuel tank is empty");
        }
    }

    protected void showStatistic() {
        System.out.println("This model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Fuel tank: " + fuelTank);
        System.out.println("Fuel in the tank: " + fuelInTank);
        System.out.println("Fuel per 100 kilometers: " + fuelPerKilometers);
    }

    @Override
    public void refuel() {
        setFuelInTank(getFuelTank());
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public String getColor() {
        return color;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public double getFuelPerKilometers() {
        return fuelPerKilometers;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public void setFuelPerKilometers(double fuelPerKilometers) {
        this.fuelPerKilometers = fuelPerKilometers;
    }
}
