package ua.bykadoroff.hw11;

public class Truck extends Car implements Recovery{
    private double cargo;

    public Truck(String model, int year, String color, double fuelTank, double fuelInTank,
                        double fuelPerKilometers, int passenger){
        super(model, year, color, fuelTank, fuelInTank, fuelPerKilometers);
        this.cargo = cargo;
    }

    protected void addCargo(double amount){
        cargo += amount;
        System.out.println("Your cargo added!");
    }

    protected void getCargo(double amount){
        cargo -= amount;
        System.out.println("You got cargo!");
    }

    @Override
    protected void run(){
        if (getFuelInTank()> 0){
            System.out.println("Car is running");
            setFuelInTank(getFuelInTank() - getFuelPerKilometers()*2);
        }
        else {
            System.out.println("Fuel tank is empty");
        }
    }

    @Override
    public void refuel() {
        setFuelInTank(getFuelTank());
        System.out.println("Your fuel tank is full!");
    }

}
