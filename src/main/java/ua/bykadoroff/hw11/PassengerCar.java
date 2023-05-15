package ua.bykadoroff.hw11;

public class PassengerCar extends Car implements Recovery{
    private int passenger;

    public PassengerCar(String model, int year, String color, double fuelTank, double fuelInTank,
                        double fuelPerKilometers, int passenger){
        super(model, year, color, fuelTank, fuelInTank, fuelPerKilometers);
        this.passenger = passenger;
    }

    protected void addPassenger(){
        if (passenger < 3) {
            passenger ++;
            System.out.println("Passenger added. We have passengers in the car: " + passenger);
        } else {
            System.out.println("Passenger must walk on foot!");
        }
    }

    @Override
    public void refuel() {
        setFuelInTank(getFuelTank());
        System.out.println("Your fuel tank is full!");
    }
}
