package ua.bykadoroff.hw11;

public class Truck extends Car implements Recovery {
    private double cargo;
    private boolean someBox;

    public Truck(String model, int year, String color, double fuelTank, double fuelInTank,
                 double fuelPerKilometers, int passenger) {
        super(model, year, color, fuelTank, fuelInTank, fuelPerKilometers);
        this.cargo = cargo;
    }

    protected void addCargo() {
        someBox = true;
    }

    protected void getCargo() {
        someBox = false;
    }

    @Override
    protected void run() {
        if (getFuelInTank() > 0) {
            System.out.println("Car is running");
            setFuelInTank(getFuelInTank() - getFuelPerKilometers() * 2);
        } else {
            System.out.println("Fuel tank is empty");
        }
    }
}
