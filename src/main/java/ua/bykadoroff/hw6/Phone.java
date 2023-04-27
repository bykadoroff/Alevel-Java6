package ua.bykadoroff.hw6;

public class Phone {

    protected String number;
    protected String model;
    protected double weight;

    public Phone(String number, String model, double weight ){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(){

    }

    public void receiveCall(String name){
        System.out.println("Calling " + name + " !!!");
    }

    public String getNumber(){
        return this.number;
    }

}
